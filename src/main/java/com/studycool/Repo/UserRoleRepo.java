package com.studycool.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studycool.model.UserRole;

@Repository
public interface UserRoleRepo extends JpaRepository<UserRole, Long>{

}
