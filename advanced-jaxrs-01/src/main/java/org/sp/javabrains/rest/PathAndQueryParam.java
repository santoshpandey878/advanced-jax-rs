package org.sp.javabrains.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{pathParam}/test")
public class PathAndQueryParam {

	@PathParam("pathParam") private String pathParamExample;
	@QueryParam("queryParam") private String queryParamExample;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test(){
		
		return "Path param is : "+pathParamExample+" and query param is : "+queryParamExample;
	}
}
