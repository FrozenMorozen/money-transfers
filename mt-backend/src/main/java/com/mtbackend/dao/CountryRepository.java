package com.mtbackend.dao;

import com.mtbackend.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

    public Iterable<Country> findByNameContainingIgnoreCase(String name);
    public Iterable<Country> findByName(String name);
}