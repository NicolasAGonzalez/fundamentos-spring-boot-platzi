package com.fundamentos.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements componentDependency{

    @Override
    public void saludar() {
        System.out.println("HOLA MUNDO DESDE MI COMPONENTE 2");
    }
}
