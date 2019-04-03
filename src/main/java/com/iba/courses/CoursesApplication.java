package com.iba.courses;

import com.iba.courses.service.DB2ConnectionService;
import com.iba.courses.service.ImsConnectionService;
import com.iba.courses.service.ImsInteractionException;
import com.iba.courses.service.ImsParameters;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class CoursesApplication {

    public static void main(String[] args) {

        ImsParameters imsParameters = new ImsParameters();
        DB2ConnectionService db2ConnectionService = new DB2ConnectionService();
        ImsConnectionService imsConnectionService = new ImsConnectionService();
        SpringApplication.run(CoursesApplication.class, args);

        try {
            imsConnectionService.init(imsParameters);
            imsConnectionService.connect();
            String message = imsConnectionService.execute("/dis a");
            System.out.println(message);
        } catch (ImsInteractionException e) {
            e.getMessage();
        }

        try {
            db2ConnectionService.init();
            String db2Message = db2ConnectionService.execute("-dis ddf");
            System.out.println(db2Message);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
