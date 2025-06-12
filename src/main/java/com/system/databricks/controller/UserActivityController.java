package com.system.databricks.controller;

import com.system.databricks.entity.compoundKey.UserActivityId;
import com.system.databricks.service.UserActivityService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserActivityController {

    private  final  UserActivityService userActivityService;

    public UserActivityController(UserActivityService userActivityService) {
        this.userActivityService = userActivityService;
    }

    @PostMapping("/save-activity")
    public ResponseEntity<String> saveActivity(@RequestBody UserActivityId userActivity){
        try {
            userActivityService.saveActivity(userActivity);
            return ResponseEntity.status(HttpStatus.CREATED).body("Atividade registrada com sucesso.");
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }catch (EntityNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());

        }
    }

}
