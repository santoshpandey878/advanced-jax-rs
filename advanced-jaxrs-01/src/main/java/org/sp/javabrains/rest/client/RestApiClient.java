package org.sp.javabrains.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.sp.javabrains.rest.Message;

public class RestApiClient {

	public static void main(String args[]){
		
		Client client = ClientBuilder.newClient();
		/*
		WebTarget target = client.target("http://localhost:8080/messenger/webapi/messages/1");
		Builder builder = target.request();
		//or
		Builder builder = target.request(MediaType.APPLICATION_JSON);
		Response response2 = builder.get();
		//or
		Message message = builder.get(Message.class);
		//or
		String msg = client.target("http://localhost:8080/messenger/webapi/messages/1")
				.request(MediaType.APPLICATION_JSON).get(String.class);
		*/
		
		/*
		 * ------------------------To create URL---------------
		 *  WebTarget baseTarget = client.target("http://localhost:8080/messenger/webapi/");
			WebTarget messagesTarget = baseTarget.path("messages");
			WebTarget singleMessageTarget = messagesTarget.path("{messageId}");
			Message message = singleMessageTarget
					.resolveTemplate("messageId", "1")
					.request(MediaType.APPLICATION_JSON)
					.get(Message.class);
		 */
		
		Response response = client.target("http://localhost:8080/messenger/webapi/messages/1")
				.request().get();
		Message message = response.readEntity(Message.class);
		System.out.println(message.getMessage());
		
		WebTarget baseTarget = client.target("http://localhost:8080/messenger/webapi/");
		WebTarget messagesTarget = baseTarget.path("messages");
		Message newMessage = new Message(4,"My New Message from client","Kaushik");
		
		Response postResponse = messagesTarget
			.request()
			.post(Entity.json(newMessage));
		// we can get all the headers and cookies related info from response object
		if(postResponse.getStatus() != 201){
			
			System.out.println("Error");
		}
		System.out.println(postResponse.readEntity(Message.class).getMessage());
		
	}
	
}
