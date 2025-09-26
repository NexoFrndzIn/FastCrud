package com.crud.christian.service;

import com.crud.christian.entity.Student;
import com.crud.christian.repository.StudenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class StudenService {

    private final StudenRepository studenRepository;

    @Transactional(readOnly = true)
    public List<Student> getStudent() {
        return studenRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Student> getStudent(Long id) {
        return studenRepository.findById(id);
    }

    public Student saveorUpdateStudent(Student student) {
        return studenRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studenRepository.deleteById(id);
    }
}
