package org.sp.javabrains.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("customMediaType")
public class CustomMediaTypeResource {

	
	
	@GET
	@Produces("text/shortdate")
	public Date test(){
		
		return Calendar.getInstance().getTime();
	}
}
