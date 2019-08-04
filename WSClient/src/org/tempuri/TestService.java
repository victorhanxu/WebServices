package org.tempuri;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

//http://www.dneonline.com/calculator.asmx?wsdl

public class TestService {
	//http://www.dneonline.com/calculator.asmx?wsdl
	public static void main(String[] args) throws ServiceException, RemoteException {
		Calculator webService = new CalculatorLocator();
		CalculatorSoap calculatorSoap = webService.getCalculatorSoap();
		int result = calculatorSoap.add(100, 20);
		System.out.println("Web service result is--->"+result);
	}

}
