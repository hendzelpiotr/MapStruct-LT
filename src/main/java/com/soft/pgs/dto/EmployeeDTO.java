package com.soft.pgs.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Piotr on 20.06.2017.
 */
@Getter
@Setter
public class EmployeeDTO {

    private Integer id;
    @Getter(AccessLevel.NONE)
    private String name;
    private List<Integer> carsIds;
    private Integer managerId;

}
