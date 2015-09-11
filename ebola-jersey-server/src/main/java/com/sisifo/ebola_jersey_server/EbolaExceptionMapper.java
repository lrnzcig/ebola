package com.sisifo.ebola_jersey_server;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import com.sisifo.ebola_jersey_server.exception.EbolaAuthenticationException;
import com.sisifo.ebola_jersey_server.exception.EbolaBaseException;

public class EbolaExceptionMapper implements ExceptionMapper<EbolaBaseException> {

	@Override
	public Response toResponse(EbolaBaseException exception) {
		if (exception instanceof EbolaAuthenticationException) {
			return Response.status(401).entity(exception.getMessage()).type("text/plain").build();
		}
		return Response.serverError().entity(exception.getMessage()).type("text/plain").build();
	}

}
