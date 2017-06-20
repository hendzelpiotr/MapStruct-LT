package com.soft.pgs.mapper;

import com.soft.pgs.domain.Car;
import com.soft.pgs.dto.CarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by phendzel on 6/20/2017.
 */
@Mapper(uses = EmployeeMapper.class)
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mappings({
            @Mapping(source = "color", target = "colour"),
            @Mapping(source = "employee", target = "employeeDTO")
    })
    CarDTO convertToDTO(Car car);

    @Mappings({
            @Mapping(source = "colour", target = "color"),
            @Mapping(source = "employeeDTO", target = "employee")
    })
    Car convertToEntity(CarDTO carDTO);

    List<CarDTO> convertToDTOs(List<Car> cars);

    List<Car> convertToEntities(List<CarDTO> carDTOs);

}
