package com.crud.christian.controller;

import com.crud.christian.entity.Student;
import com.crud.christian.repository.StudenRepository;
import com.crud.christian.service.StudenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @GetMapping
    public List <Student> getAllStudents() {
        return studenService.getStudent();
        }

    @Autowired
   private  StudenService studenService;
    @GetMapping("/{studentId}")
    public Optional<Student> getBID(@PathVariable Long studentId){
        return studenService.getStudent(studentId);
    }
    @PostMapping
    public void saveUpdate(@RequestBody Student studen){
         studenService.saveorUpdateStudent(studen);
    }
    @DeleteMapping("/{studentId}")
    public void saveUpdate(@PathVariable("studentId") Long studentId){
        studenService.deleteStudent(studentId);
    }
}
