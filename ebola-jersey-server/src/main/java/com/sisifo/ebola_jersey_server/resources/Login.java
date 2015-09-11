package com.sisifo.ebola_jersey_server.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import com.sisifo.ebola_jersey_server.exception.EbolaAuthenticationException;

@Path("login")
public class Login {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getUserName(@Context SecurityContext securityContext) {
    	if (securityContext.getUserPrincipal() == null) {
    		throw new EbolaAuthenticationException("login body method");
    	}
        return securityContext.getUserPrincipal().getName();
    }
}
