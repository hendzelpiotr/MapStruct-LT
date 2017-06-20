package com.soft.pgs.service;

import com.soft.pgs.domain.Employee;
import com.soft.pgs.dto.EmployeeDTO;
import com.soft.pgs.mapper.EmployeeMapper;
import com.soft.pgs.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Piotr on 20.06.2017.
 */
@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> allEmployees = employeeRepository.findAll();
        /*
        *
        * Some business logic
        *
        * */
        return EmployeeMapper.INSTANCE.convertToDTOs(allEmployees);
    }

    public EmployeeDTO getOne(Integer id) {
        Employee employee = employeeRepository.findOne(id);
        /*
        *
        * Some business logic
        *
        * */
        return EmployeeMapper.INSTANCE.convertToDTO(employee);
    }

}
