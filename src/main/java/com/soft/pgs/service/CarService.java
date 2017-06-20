package com.soft.pgs.service;

import com.soft.pgs.domain.Car;
import com.soft.pgs.dto.CarDTO;
import com.soft.pgs.mapper.CarMapper;
import com.soft.pgs.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Piotr on 20.06.2017.
 */
@Service
@Transactional
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<CarDTO> getAllEmployees() {
        List<Car> cars = carRepository.findAll();
        /*
        *
        * Some business logic
        *
        * */
        return CarMapper.INSTANCE.convertToDTOs(cars);
    }

    public CarDTO getOne(Integer id) {
        Car car = carRepository.findOne(id);
        /*
        *
        * Some business logic
        *
        * */
        return CarMapper.INSTANCE.convertToDTO(car);
    }

}
