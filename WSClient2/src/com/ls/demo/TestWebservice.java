package com.ls.demo;

public class TestWebservice {

	public static void main(String[] args) {
		HelloWorld helloService = new HelloWorldService().getHelloWorldPort();
		String response = null;
		try {
			response=helloService.sayHello("Luke&Mark");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("Response from remote SOAP service: "+response);
	}

}
