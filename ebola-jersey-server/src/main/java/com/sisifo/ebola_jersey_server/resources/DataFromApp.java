package com.sisifo.ebola_jersey_server.resources;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import com.sisifo.ebola_jersey_server.data.EbolaDatabase;
import com.sisifo.ebola_jersey_server.exception.EbolaAuthenticationException;

import xre.EbolaAppData;
import xre.EbolaChart;
import xre.EbolaDataTable;

@Path("data-from-app")
public class DataFromApp {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public EbolaAppData getAppData(@Context SecurityContext securityContext, String appName) {
    	if (securityContext.getUserPrincipal() == null) {
    		throw new EbolaAuthenticationException("body method");
    	}
    	EbolaDataTable dataTable = EbolaDatabase.getBasicDataTable(appName);
    	EbolaChart chart = EbolaDatabase.getBasicChart(appName, null);
        return new EbolaAppData(dataTable, chart);
    }
}
