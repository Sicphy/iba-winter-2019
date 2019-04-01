package com.iba.courses.rest;

import com.iba.courses.domain.Student;
import com.iba.courses.service.ImsConnectionService;
import com.iba.courses.service.ImsInteractionException;
import com.iba.courses.service.ImsParameters;
import com.iba.courses.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/student")
@CrossOrigin
public class StudentApi {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAllStudents")
    private List<Student> getAllStudents() {
        System.out.println("REST");
        return studentService.getAllStudents();
    }

    @PostMapping("/setStudent")
    private void setStudent(@RequestBody Student student) {
        studentService.setNewStudent(student);
    }

    @GetMapping("/greeting/{myVariable}")
    private String greeting(@PathVariable String myVariable) {
        return "Hello s" + myVariable;
    }

    @GetMapping("/ims/{myVariable}")
    private Map ims(@PathVariable String myVariable) {
        ImsParameters imsParameters = new ImsParameters();
        ImsConnectionService imsConnectionService = new ImsConnectionService();
        String message = "";
        try {
            imsConnectionService.init(imsParameters);
            imsConnectionService.connect();
            message = imsConnectionService.execute("/dis a");
        } catch (ImsInteractionException e) {
            e.getMessage();
        }

        return Collections.singletonMap("result", message);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "HTTP DELETE was called";
    }

    @PostMapping("/simplePost/{id}")
    private int postMethod(@RequestBody String s, @PathVariable int id) {
        System.out.println(s);
        return id;
    }
}
