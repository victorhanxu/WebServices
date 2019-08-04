package com.ls.demo;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class TestWebservice {

	public static void main(String[] args) {
		HelloWorldService helloService = new HelloWorldServiceLocator();
		HelloWorld helloWorld = null;
		try {
			helloWorld = helloService.getHelloWorldPort();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		String name = "Victor, Luke and Mark";
		String response = null;
		try {
			response = helloWorld.sayHello(name);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(response);
	}

}
