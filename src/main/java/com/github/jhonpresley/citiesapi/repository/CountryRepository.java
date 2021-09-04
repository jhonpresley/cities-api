package com.github.jhonpresley.citiesapi.repository;


import com.github.jhonpresley.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
