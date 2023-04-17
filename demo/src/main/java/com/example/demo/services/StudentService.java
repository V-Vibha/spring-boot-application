package com.example.demo.services;

import com.example.demo.entities.Student;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

//Annotation helps to register this as a bean
//Possible values - @component, @configuration, @repository
@Service
public class StudentService {

    //Use lazy to annotate only when service is available - useful for circular dependencies
    @Lazy
    @Autowired
    StudentRepository repository;

    public void save(Student student)
    {
        repository.save(student);
    }
}
