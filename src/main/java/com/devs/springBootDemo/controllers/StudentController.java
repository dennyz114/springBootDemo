package com.devs.springBootDemo.controllers;

import com.devs.springBootDemo.models.Student;
import com.devs.springBootDemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// (controller) => (service) => (dao) => BD
/**
 * Component -> will allow to do DI on it
 * */
@RestController
@RequestMapping("api/student")
public class StudentController {

    private final StudentService studentService;

    /**
     * Autowired -> Inject dependency
     * */
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }
}
