package com.sisifo.ebola_jersey_server.resources;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import com.sisifo.ebola_jersey_server.exception.EbolaAuthenticationException;

import xre.EbolaData;

@Path("submit-data")
public class SubmitData {

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String getUserName(@Context SecurityContext securityContext, EbolaData data) {
    	if (securityContext.getUserPrincipal() == null) {
    		throw new EbolaAuthenticationException("login body method");
    	}
        return securityContext.getUserPrincipal().getName();
    }
}
