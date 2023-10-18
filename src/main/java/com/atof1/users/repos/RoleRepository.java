package com.atof1.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.atof1.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);
}