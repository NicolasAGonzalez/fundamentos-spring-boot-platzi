package com.fundamentos.springboot.fundamentos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping //acepta solicitudes http dentro de este metodo
    @ResponseBody
    public ResponseEntity<String> function(){
        ResponseEntity hello_from_controller = new ResponseEntity<>("Hello from controller un cambio dos cambios", HttpStatus.OK);
        return hello_from_controller;
    }

}
