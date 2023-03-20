package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanImplement;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.springboot.fundamentos.component.componentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	//aca estoy inyectando las dependencias
	private componentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;

	//Aca en el constructor llamo a esas dependencias
	public FundamentosApplication(@Qualifier("componentTwoImplement") componentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	//Aca llamo a la implementación de las dependencias
	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
	}
}
