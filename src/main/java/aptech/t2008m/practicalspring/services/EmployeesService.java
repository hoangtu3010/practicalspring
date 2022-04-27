package aptech.t2008m.practicalspring.services;

import aptech.t2008m.practicalspring.entity.Employees;
import aptech.t2008m.practicalspring.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {
    @Autowired
    private EmployeesRepository employeesRepository;

    public List<Employees> findAllEmployees() {
        return employeesRepository.findAll();
    }

    public Employees createEmployee(Employees employees) {
        return employeesRepository.save(employees);
    }
}
