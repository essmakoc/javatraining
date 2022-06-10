package com.vitelco.training.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Logger {

    public static void info(String message){
        System.out.println(LocalDateTime.now() + " | " + message);
    }


}
