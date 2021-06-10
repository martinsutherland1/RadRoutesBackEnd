package com.RadRoutes.RadRoutesService.repository;

import com.RadRoutes.RadRoutesService.models.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
}
