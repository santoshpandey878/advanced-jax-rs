package org.sp.javabrains.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class InvocationDemo {

	public static void main(String[] args) {
		InvocationDemo obj = new InvocationDemo();
		Invocation prepareRequestForMessageByYear = obj.prepareRequestForMessageByYear(2016);
		Response response = prepareRequestForMessageByYear.invoke();
		System.out.println(response.getStatus());
	}

	private Invocation prepareRequestForMessageByYear(int year) {
		Client client = ClientBuilder.newClient();
		return client.target("http://localhost:8080/messenger/webapi/")
				.path("messages")
				.queryParam("year", year)
				.request()
				.buildGet();
			
	}

}
