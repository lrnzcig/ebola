package com.sisifo.ebola_jersey_server.resources;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import com.sisifo.ebola_jersey_server.data.EbolaDatabase;
import com.sisifo.ebola_jersey_server.exception.EbolaAuthenticationException;

import xre.EbolaDataTable;

@Path("get-real-data")
public class RealDataFromApp {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public EbolaDataTable getUserName(@Context SecurityContext securityContext, EbolaDataTable data) {
    	if (securityContext.getUserPrincipal() == null) {
    		throw new EbolaAuthenticationException("body method");
    	}
    	int length = 0;
    	for (Integer i : data.getIths()) {
    		if (i == null) {
    			break;
    		}
    		length++;
    	}
        return EbolaDatabase.getBasicRealDataTable(data.getAppName(), length);
    }
}
