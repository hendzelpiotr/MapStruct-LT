package com.soft.pgs.mapper;

import com.soft.pgs.domain.Car;
import com.soft.pgs.domain.Employee;
import com.soft.pgs.dto.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Piotr on 20.06.2017.
 */
@Mapper(uses = CarMapper.class, imports = {Collectors.class, Car.class}, nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION, componentModel = "spring")
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mappings({
            @Mapping(target = "carsIds", source = "cars"),
            @Mapping(target = "managerId", source = "manager.id")
    })
    EmployeeDTO convertToDTO(Employee employee);

    @Mappings({
            @Mapping(target = "cars", ignore = true)
    })
    Employee convertToEntity(EmployeeDTO employeeDTO);

    List<EmployeeDTO> convertToDTOs(List<Employee> employees);

    List<Employee> convertToEntities(List<EmployeeDTO> employeeDTOs);

    default List<Integer> carsToIntegerList(List<Car> cars) {
        if (cars != null) {
            return cars.stream().map(Car::getId).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

}
