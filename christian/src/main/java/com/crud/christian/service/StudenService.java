package com.crud.christian.service;

import com.crud.christian.entity.Student;
import com.crud.christian.repository.StudenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudenService {
    @Autowired
     StudenRepository studenRepository;
    public List<Student> getStudent(){
        return studenRepository.findAll();
    }
    public Optional<Student> getStudent(Long id){
        return studenRepository.findById(id);
    }
    public void saveorUpdateStudent(Student student){
        studenRepository.save(student);
    }
    public void deleteStudent(Long id){
        studenRepository.deleteById(id);
    }

}
