package com.iba.courses;

import com.iba.courses.service.ImsConnectionService;
import com.iba.courses.service.ImsInteractionException;
import com.iba.courses.service.ImsParameters;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoursesApplication {

    public static void main(String[] args) {

        ImsParameters imsParameters = new ImsParameters();
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

    }
}
