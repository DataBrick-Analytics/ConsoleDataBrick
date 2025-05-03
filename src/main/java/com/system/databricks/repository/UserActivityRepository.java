package com.system.databricks.repository;

import com.system.databricks.entity.UserActivity;
import com.system.databricks.entity.compoundKey.UserActivityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserActivityRepository extends JpaRepository<UserActivity,UserActivityId> {

}
