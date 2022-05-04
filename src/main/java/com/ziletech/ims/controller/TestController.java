package com.ziletech.ims.controller;

import com.ziletech.ims.beans.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
@RestController
public class TestController {

    @GetMapping("time/first")
    public ResponseEntity<String> getHello(){
        String response = "Hello world First. Now time is " + new Date();
        ResponseEntity<String> responseEntity = new ResponseEntity(response, HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping("time/second")
    public ResponseEntity<String> getHello2(){
        String response = "Hello world Second. Now time is " + new Date();
        ResponseEntity<String> responseEntity = new ResponseEntity(response, HttpStatus.OK);
        return responseEntity;
    }


    @GetMapping("color")
    public ResponseEntity<String> getColor(){
        String content = "Red color :  " + new Date();
        ResponseEntity<String> responseEntity = new ResponseEntity(content, HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping("random")
    public ResponseEntity<Long> getRandom(){
        long random = System.currentTimeMillis();
        ResponseEntity<Long> responseEntity = new ResponseEntity(random, HttpStatus.NOT_FOUND);
        return responseEntity;
    }

    @GetMapping("employee")
    public ResponseEntity<Employee> getEmployee(){
       Employee employee = new Employee();
       employee.setId(2);
       employee.setName("Yukti");
       Collection<String> roles = new ArrayList<>();
       roles.add("Admin");
       roles.add("User");
       employee.setRoles(roles);
       return new ResponseEntity<>(employee, HttpStatus.OK);
    }


}
