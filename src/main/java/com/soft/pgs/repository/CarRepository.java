package com.soft.pgs.repository;

import com.soft.pgs.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Piotr on 20.06.2017.
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}
