package com.codecrafters.server.services.impl;


import com.codecrafters.server.dao.CityRepository;
import com.codecrafters.server.dao.CountryRepository;
import com.codecrafters.server.dao.PointRepository;
import com.codecrafters.server.entities.City;
import com.codecrafters.server.entities.Country;
import com.codecrafters.server.entities.Point;
import com.codecrafters.server.services.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PointServiceImpl implements PointService {

    @Autowired
    private PointRepository pointRepository;

    @Override
    public List<Point> findPointByFilter(String name) {
        return pointRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public void add(Point point) {
        pointRepository.save(point);
    }

    @Override
    public List<Point> findByCity(City city) {
        return pointRepository.findByCity(city);
    }

    @Override
    public Iterable<Point> findAll() {
        return  pointRepository.findAll();
    }

    @Override
    public void clear() {
        pointRepository.deleteAll();
    }


}
