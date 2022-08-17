package com.projects.fleet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projects.fleet.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
