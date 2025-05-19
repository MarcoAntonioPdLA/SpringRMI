package com.unsa.springrmi;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) throws Exception {
        CalculatorService calculatorService = new CalculatorServiceImplementation();

        Registry registry = LocateRegistry.createRegistry(1099);
        registry.bind("CalculatorService", calculatorService);

        System.out.println("Server started");
    }
}