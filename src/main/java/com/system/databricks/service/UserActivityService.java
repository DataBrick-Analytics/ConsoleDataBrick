package com.system.databricks.service;

import com.system.databricks.entity.UserActivity;
import com.system.databricks.entity.compoundKey.UserActivityId;
import com.system.databricks.repository.ActivityRepository;
import com.system.databricks.repository.EnterpriseRepository;
import com.system.databricks.repository.UserActivityRepository;
import com.system.databricks.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserActivityService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EnterpriseRepository enterpriseRepository;

    @Autowired
    ActivityRepository activityRepository;

    @Autowired
    UserActivityRepository userActivityRepository;

    public void saveActivity(UserActivityId userActivityId) {
        UserActivity userActivity = new UserActivity();
        userActivity.setUserActivityId(userActivityId);

        if (userActivity.getUserActivityId().getIdActivity() == null) {
            throw new IllegalArgumentException("Id da atividade não pode ser nulo.");
        }
        if (userActivity.getUserActivityId().getFkEnterprise() == null) {
            throw new IllegalArgumentException("Id da empresa não pode ser nulo.");
        }
        if (userActivity.getUserActivityId().getUserId() != null && !userRepository.existsById(userActivity.getUserActivityId().getUserId())) {
            throw new EntityNotFoundException("Usuário não encontrado.");
        }


        if (!activityRepository.existsById(userActivityId.getIdActivity())) {
            throw new EntityNotFoundException("Atividade não encontrada.");
        }
        if (!enterpriseRepository.existsById(userActivityId.getFkEnterprise())) {
            throw new EntityNotFoundException("Empresa não encontrada.");
        }

        userActivity.setDtCreation(new Date());
        userActivity.setDtEdition(new Date());
        userActivityRepository.save(userActivity);
    }
}
