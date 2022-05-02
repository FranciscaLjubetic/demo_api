package com.nisum.demo.repository;

import com.nisum.demo.model.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepo extends JpaRepository<People, Integer> {
}
