package com.project.Cyaegha96.board.web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("")
    public String Home(){
       return "/layout/hello";
    }

}
