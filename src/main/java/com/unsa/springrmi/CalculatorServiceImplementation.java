package com.unsa.springrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServiceImplementation extends UnicastRemoteObject implements CalculatorService {
	//Constante que sirve de buena práctica para implementar Serializable
	//de forma implícita con UnicastRemoteObject.
	private static final long serialVersionUID = 1L;
	
	public CalculatorServiceImplementation() throws RemoteException {
		super();
	}
	
	public int add(int a, int b) throws RemoteException {
		return a + b;
	}
	
	public int subtract(int a, int b) throws RemoteException {
		return a - b;
	}
}