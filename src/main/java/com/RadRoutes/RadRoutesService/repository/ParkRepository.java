package com.RadRoutes.RadRoutesService.repository;


import com.RadRoutes.RadRoutesService.models.Park;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkRepository extends JpaRepository<Park, Long> {
}
