package com.amigosapi.dive.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/vi/student")
public class StudentController {

    private final StudentService StudentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.StudentService = studentService;
    }

}
