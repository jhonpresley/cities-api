package com.github.jhonpresley.citiesapi.countries.repository;


import com.github.jhonpresley.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
