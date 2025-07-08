package com.example.StudentSpringBoot.controllers;

import com.example.StudentSpringBoot.models.Students;
import com.example.StudentSpringBoot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService ss;

    @GetMapping
    public List<Students> getStudents() {
        return ss.showstudents();
    }

    @GetMapping("/name/{name}")
    public List<Students> getStudentsByName(@PathVariable String name) {
        return ss.getStudentByname(name);
    }

    @PostMapping
    public String addStudent( @RequestBody Students student) {
        return ss.addStudent(student);
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Students student) {
        return ss.updatedStudent(id ,student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        return ss.deletestudent(id);
    }

}
