package com.template.auth_microservice.security.infra.persistence;

import com.template.auth_microservice.security.domain.Role;
import com.template.auth_microservice.security.domain.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
