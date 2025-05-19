package com.unsa.springrmi;

import java.rmi.RemoteException;

public class CalculatorServiceImplementation implements CalculatorService {

    public CalculatorServiceImplementation() throws RemoteException {
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        return a - b;
    }
}