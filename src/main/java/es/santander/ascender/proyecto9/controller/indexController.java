package es.santander.ascender.proyecto9.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping ("/nico")
    public String get(){
        return "index";
    }
    
}
