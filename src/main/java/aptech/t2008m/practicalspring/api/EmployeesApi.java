package aptech.t2008m.practicalspring.api;

import aptech.t2008m.practicalspring.entity.Employees;
import aptech.t2008m.practicalspring.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/employees")
public class EmployeesApi {
    @Autowired
    EmployeesService employeesService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Employees>> findAll() {
        return ResponseEntity.ok(employeesService.findAllEmployees());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Employees> save(@RequestBody Employees employees) {
        return ResponseEntity.status(HttpStatus.CREATED).body(employeesService.createEmployee(employees));
    }
}
