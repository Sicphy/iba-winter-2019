package com.iba.courses.service;

import com.ibm.ims.connect.ImsConnectApiException;

public class ImsInteractionException extends Throwable {
    public ImsInteractionException(String message, Exception e) {
        System.out.println(message);
        System.out.println(e);

    }
}
