package com.crudapp.jukevote.repository;

import java.util.Optional;

import com.crudapp.jukevote.model.ERole;
import com.crudapp.jukevote.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
