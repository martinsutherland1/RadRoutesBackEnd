package com.RadRoutes.RadRoutesService.repository;

import com.RadRoutes.RadRoutesService.models.Coordinate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinateRepository extends JpaRepository<Coordinate, Long> {
}
