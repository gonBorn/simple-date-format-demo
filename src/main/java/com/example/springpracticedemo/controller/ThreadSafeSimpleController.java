package com.example.springpracticedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class ThreadSafeSimpleController {
    // we can use factory method and pass it with a lambda which tells the threadlocal initial value
    public static ThreadLocal<SimpleDateFormat> dateFormat = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"));

    @GetMapping("/formattedDate/thread-safe")
    public Date getFormattedDate() throws ParseException {
        String dateStr = "2018-06-22T10:00:00";
        return dateFormat.get().parse(dateStr);
    }
}
