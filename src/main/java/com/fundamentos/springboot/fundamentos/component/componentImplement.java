package com.fundamentos.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class componentImplement implements componentDependency{
    @Override
    public void saludar() {
        System.out.println("hola mundo desde mi componente");
    }
}
