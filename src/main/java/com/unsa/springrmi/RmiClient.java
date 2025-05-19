package com.unsa.springrmi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RmiClient {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClientAppConfig.class);
        CalculatorService service = (CalculatorService) context.getBean("calculatorService");

        int suma = service.add(5, 3);
        int resta = service.subtract(10, 4);

        System.out.println("5 + 3 = " + suma);
        System.out.println("10 - 4 = " + resta);

        context.close();
    }
}
