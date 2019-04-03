package com.iba.courses.rest;

import com.iba.courses.domain.Student;
import com.iba.courses.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
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

    @PostMapping("/ims")
    private Map ims(@RequestBody String myVariable) {
        ImsParameters imsParameters = new ImsParameters();
        ImsConnectionService imsConnectionService = new ImsConnectionService();
        String message = "";
        try {
            imsConnectionService.init(imsParameters);
            imsConnectionService.connect();
            message = imsConnectionService.execute(myVariable);
            // message = imsConnectionService.execute("/dis a");
        } catch (ImsInteractionException e) {
            e.getMessage();
        }

        return Collections.singletonMap("result", message);
    }
    @GetMapping("/db2/{myVariable}")
    private Map db2(@PathVariable String myVariable) {

        DB2ConnectionService db2ConnectionService = new DB2ConnectionService();
        String db2Message = "";
        try {
            System.out.println(myVariable);
            db2ConnectionService.init();
            db2Message = db2ConnectionService.execute(myVariable);
            System.out.println(db2Message);
            // db2Message = db2ConnectionService.execute("-dis ddf");
        } catch (SQLException e) {
            e.getMessage();
        } catch (NullPointerException e) {
            // System.out.println(db2Message);
            return Collections.singletonMap("result", "Error !!! Incorrect command.");
        }

        return Collections.singletonMap("result", db2Message);
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
