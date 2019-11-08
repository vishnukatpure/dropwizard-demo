package com.dev.demo.controller;

import javax.validation.Validator;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.dev.demo.model.Employee;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeController {

	public Validator validator;

	public EmployeeController(Validator validator) {
		this.validator = validator;
	}

	@GET
	@Path("/{id}")
	public Response getEmployeeById(@PathParam("id") Integer id) {
		Employee employee = new Employee(1L, "vishnu", 30);
		return Response.ok(employee).build();
	}
}
