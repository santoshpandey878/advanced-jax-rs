package org.sp.javabrains.rest;

import java.util.Calendar;
import java.util.Date;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// message body writer demo

@Path("messagebodywriter")
public class MessageBodyWriterResource {

	private int count;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Date test(){	
		return Calendar.getInstance().getTime();
	}
}
