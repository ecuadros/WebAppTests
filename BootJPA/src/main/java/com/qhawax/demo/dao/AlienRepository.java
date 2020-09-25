package com.qhawax.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.qhawax.demo.model.Alien;

public interface AlienRepository extends CrudRepository<Alien, Integer>
{
	List<Alien> findByTech(String tech);
	List<Alien> findByAidGreaterThan(Integer id);
	List<Alien> findByAidGreaterThanEqual(Integer id);
	
	List<Alien> findByAidLessThan(Integer id);
	List<Alien> findByAidLessThanEqual(Integer id);
	
	List<Alien> findByAidGreaterThanEqualAndTechGreaterThanEqualOrAnameContaining(Integer id, String tech, String name);
}
