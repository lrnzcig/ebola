package com.sisifo.ebola_jersey_server.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import com.sisifo.ebola_jersey_server.exception.EbolaAuthenticationException;

import xre.EbolaAppsList;

@Path("login")
public class Login {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public EbolaAppsList getListOfApps(@Context SecurityContext securityContext) {
    	if (securityContext.getUserPrincipal() == null) {
    		throw new EbolaAuthenticationException("login body method");
    	}
    	// returns list of apps
    	String[] apps = new String[3];
     	apps[0] = "Bubble breaker";
    	apps[1] = "Candy swipe slots";
    	apps[2] = "Blood zombie";
    	EbolaAppsList l = new EbolaAppsList(apps);
        return l;
    }
}
