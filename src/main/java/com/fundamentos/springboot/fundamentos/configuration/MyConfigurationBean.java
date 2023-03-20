package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement(); //con cambiar aca, puede implementar una nueva funcionalidad directamente
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement(); //con cambiar aca, puede implementar una nueva funcionalidad directamente
    }

    @Bean
    public MyBeanWithDependency beanOperationOperationWithDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
