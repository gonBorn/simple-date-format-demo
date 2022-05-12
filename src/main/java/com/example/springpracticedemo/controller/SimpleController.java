package com.example.springpracticedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class SimpleController {
    public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    @GetMapping("/formattedDate")
    public Date getFormattedDate() throws ParseException {
        String dateStr = "2018-06-22T10:00:00";
        return simpleDateFormat.parse(dateStr);
    }
}
