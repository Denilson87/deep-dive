package com.amigosapi.dive.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/vi/student")
public class studentController {

    private final StudentService studentService;
    @Autowired
    public studentController(StudentService studentService) {
        this.studentService = studentService;
    }

}
