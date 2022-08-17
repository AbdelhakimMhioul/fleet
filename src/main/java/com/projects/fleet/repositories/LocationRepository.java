package com.projects.fleet.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projects.fleet.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
