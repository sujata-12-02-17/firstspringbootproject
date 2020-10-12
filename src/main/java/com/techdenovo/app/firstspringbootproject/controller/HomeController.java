package com.techdenovo.app.firstspringbootproject.controller;

import com.techdenovo.app.firstspringbootproject.domain.Student;
import com.techdenovo.app.firstspringbootproject.repository.StudentRepository;
import com.techdenovo.app.firstspringbootproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class HomeController {
    @GetMapping("/")
    public String hello(){
        return "Hello world";
    }



}
