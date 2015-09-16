package com.sisifo.ebola_jersey_server.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import com.sisifo.ebola_jersey_server.data.EbolaDatabase;
import com.sisifo.ebola_jersey_server.exception.EbolaAuthenticationException;

import xre.EbolaAppsList;

@Path("login")
public class Login {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public EbolaAppsList getListOfApps(@Context SecurityContext securityContext) {
    	if (securityContext.getUserPrincipal() == null) {
    		throw new EbolaAuthenticationException("body method");
    	}
    	// returns list of apps for combo
        return EbolaDatabase.getListOfApps();
    }
}
