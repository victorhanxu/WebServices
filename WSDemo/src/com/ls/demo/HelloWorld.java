package com.ls.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
//This is SOAP web service demo project, it provides a soap service interface(method) to client.
@WebService
public class HelloWorld {
	@WebMethod
	public String sayHello(String str) {
		System.out.println("get Message...");
		String result = "Hello , " + str;
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Now the server is running");
		String address = "http://localhost:9000/HelloWorld";
		Object implementor = new HelloWorld();
		Endpoint.publish(address, implementor);
	}

}
