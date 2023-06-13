package com.itvdn.controllers;

import org.springframework.web.bind.annotation.*;
import com.itvdn.persistence.dao.services.interfaces.EmployeeSimpleService;
import com.itvdn.persistence.model.Employee;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

//Здесь показана комбинация использования аннотаций @RequestMapping, которая задает часть урлы,
// которая будет пропуском к методам этого контроллераdw
// а уже в методах используются часть урлы, идущая после /employee
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private static final Log LOG = LogFactory.getLog(EmployeeController.class);
    @Autowired
    private EmployeeSimpleService employeeSimpleService;

// Метод добавления нового сотрудника
    @PostMapping(value = "/add")
    public String addNewEmployee(HttpServletRequest request) {
//        Мы создаем новый объект, получаем его идентификатор и выводим в логи.
        Employee employee = new Employee();
        employee.setName(request.getParameter("name"));
        employee.setPosition(request.getParameter("position"));
        employee.setPhone(request.getParameter("phone"));
        LOG.info("New employee with id " + employeeSimpleService.addEmployee(employee).getId()
                + " was added.");
        return "redirect:/employee/all";
    }

//    Метод для выведения на экран всех сотрудников.
    @GetMapping(value = "/all")
    public ModelAndView listAllEmployee(ModelAndView modelAndView) {
//        Данная команда просто выводит id сотрудников в консоль (в логи)
        employeeSimpleService.listAllEmployee();
//        В модельивью мы добавляем объект, который является результатом обращения к сервису,
//        а имя полученного объекта - employees
        modelAndView.addObject("employees", employeeSimpleService.findAll());
//        Также для нашей modelAndView мы устанавливаем имя нашего отображения.
        modelAndView.setViewName("employees.jsp");
        return modelAndView;
    }

    @GetMapping(value = "/remove/{id}")
    public ModelAndView deleteEmployee(@PathVariable long id, ModelAndView modelAndView)  {
        employeeSimpleService.removeById(id);
        modelAndView.addObject("employees", employeeSimpleService.findAll());
        modelAndView.setViewName("redirect:/employee/all");
        return modelAndView;
    }

    @PostMapping(value = "/findByName")
    public ModelAndView findEmployeeByName(@RequestParam("name") String name, ModelAndView modelAndView) {

        modelAndView.addObject("employees", employeeSimpleService.findEmployeeByName(name));

        modelAndView.setViewName("/employee/search-results.jsp");
        return modelAndView;
    }
    @PostMapping(value = "/findByNameAndPosition")
    public ModelAndView findEmployeeByNameAndPosition(@RequestParam("name") String name,
                                                      @RequestParam("position") String position,
                                                      ModelAndView modelAndView) {
        modelAndView.addObject("employees", employeeSimpleService.findEmployeeByNameAndPosition(
                name, position
        ));
        modelAndView.setViewName("/employee/search-results.jsp");
        return modelAndView;
    }

    @PostMapping(value = "/findByNameAndPhone")
    public ModelAndView findEmployeeByNameAndPhone(@RequestParam("name") String name,
                                                   @RequestParam("phone") String phone,
                                                   ModelAndView modelAndView) {
        modelAndView.addObject("employees", employeeSimpleService.findEmployeeByNameAndPhone(
                name, phone
        ));
        modelAndView.setViewName("/employee/search-results.jsp");
        return modelAndView;
    }
}
