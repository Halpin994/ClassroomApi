package com.cognizant.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


import com.cognizant.service.IClassroomService;

@Path("/classroom")
public class ClassroomEndpoint {
	
	@Inject
	private IClassroomService service;

	@Path("/getAllClassrooms")
	@GET
	@Produces({ "application/json" })
	public String getAllClassrooms() {
		return service.getAllClassrooms();
	}
	
	@Path("/getClassroom/{id}")
	@GET
	@Produces({ "application/json" })
	public String getAllClassrooms(@PathParam("id") Long id) {
		return service.getClassroom(id);
	}

	@Path("/createClassroom")
	@POST
	@Produces({ "application/json" })
	public String createClassroom(String classroom) {
		return service.createClassroom(classroom);
	}

	@Path("/deleteClassroom/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteClassroom(@PathParam("id") Long id) {
		return service.deleteClassroom(id);
	}

	public void setService(IClassroomService service) {
		this.service = service;
	}

}
