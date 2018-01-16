package org.sp.javabrains.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

// param converter demo

@Path("date/{dateString}")
public class DateResource {

	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getRequestedDate(@PathParam("dateString") MyDate mydate){
		
		return "Date is : "+mydate.toString();
	}
}
