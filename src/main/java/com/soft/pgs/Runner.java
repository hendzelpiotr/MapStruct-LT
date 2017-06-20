package com.soft.pgs;

import com.soft.pgs.domain.Car;
import com.soft.pgs.dto.CarDTO;
import com.soft.pgs.mapper.CarMapper;

/**
 * Created by phendzel on 6/20/2017.
 */
public class Runner {

    public static void main(String[] args) {
        Car car = new Car(1, "Red");

        CarDTO carDTO = CarMapper.INSTANCE.convertToDTO(car);

        System.out.println("DTO: Id: " + carDTO.getId() + ", color: " + carDTO.getColour());
    }
}
