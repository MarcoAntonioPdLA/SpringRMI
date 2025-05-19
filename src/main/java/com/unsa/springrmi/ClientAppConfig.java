package com.unsa.springrmi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class ClientAppConfig {

    @Bean
    public RmiProxyFactoryBean calculatorService() {
        RmiProxyFactoryBean proxy = new RmiProxyFactoryBean();
        proxy.setServiceInterface(CalculatorService.class);
        proxy.setServiceUrl("rmi://localhost:1099/CalculatorService");
        return proxy;
    }
}
