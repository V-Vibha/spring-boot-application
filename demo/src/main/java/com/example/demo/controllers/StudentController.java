package com.example.demo.controllers;

import com.example.demo.entities.Student;
import com.example.demo.repositories.StudentRepository;
import org.springframework.web.bind.annotation.*;

//dto - data transfer objects : get value only for those that may be manipulated/...
@RestController
public class StudentController
{
    @GetMapping("/hello")
    public String hello()
    {
        return "hello world";
    }

//    @GetMapping("hello/{id}")
//    public String getID(@PathVariable("id") String id, @RequestParam("name") String name){
//        return "hello " + name;
//    }

    StudentRepository repository;
    @PostMapping("student")
    public Student postName(@RequestBody Student student)
    {
        return repository.save(student);
    }

//    @GetMapping("hello/{id}")
//    public String getName(@RequestParam("id") Long id)
//    {
//        return name;
//    }

}
