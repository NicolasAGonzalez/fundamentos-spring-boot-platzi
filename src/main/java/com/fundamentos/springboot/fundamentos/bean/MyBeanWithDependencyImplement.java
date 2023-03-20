package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    //Inyecto una dependencia dentro de otra dependencia
    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero=1;
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde la implementation de un bean con dependencias");
    }
}
