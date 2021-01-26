package com.example.demo.controller;

import com.example.demo.entity.Numbers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname AddAndMult
 * @Author GuOHuI
 * @Date 2021/1/25
 * @Time 21:54
 */
@RestController
@RequestMapping
public class AddAndMult {
    @RequestMapping("/add")
    public String Add(Numbers numbers){
        int a = numbers.getA();
        int b = numbers.getB();
        int count = a + b;
        return String.valueOf(count);

    }
    @RequestMapping("/mult")
    public String Mult(Numbers numbers){
        int a = numbers.getA();
        int b = numbers.getB();
        int mult = a * b;
        return String.valueOf(mult);

    }
}
