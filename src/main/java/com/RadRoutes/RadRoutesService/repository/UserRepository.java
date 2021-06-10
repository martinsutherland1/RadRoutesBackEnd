package com.RadRoutes.RadRoutesService.repository;

import com.RadRoutes.RadRoutesService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
