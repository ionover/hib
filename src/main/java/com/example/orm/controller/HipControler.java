package com.example.orm.controller;

import com.example.orm.entitys.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/persons/by-city")

public class HipControler {

    @GetMapping
    public List<Person> findAll(@RequestParam String city) {
        return ;
    }

}
