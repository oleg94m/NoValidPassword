package com.itvdn.persistence.dao.services.interfaces;

import com.itvdn.persistence.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeSimpleService {
    List<Employee> findAll();

    Employee addEmployee(Employee employee);

    void removeById(long id);

    void listAllEmployee();

    List<Employee> findEmployeeByName(String name);

    List<Employee> findEmployeeByNameAndPosition(String name, String position);

    List<Employee> findEmployeeByNameAndPhone(String name, String phone);

}
