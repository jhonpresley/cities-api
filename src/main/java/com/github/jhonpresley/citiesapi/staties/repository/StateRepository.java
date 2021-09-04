package com.github.jhonpresley.citiesapi.staties.repository;

import com.github.jhonpresley.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
