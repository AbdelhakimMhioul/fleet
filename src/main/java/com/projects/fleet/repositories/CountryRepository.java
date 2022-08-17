package com.projects.fleet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projects.fleet.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
