package com.sisifo.ebola_jersey_server.resources;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import com.sisifo.ebola_jersey_server.exception.EbolaAuthenticationException;

import xre.EbolaChart;
import xre.EbolaData;

@Path("submit-data")
public class SubmitData {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public EbolaChart getUserName(@Context SecurityContext securityContext, EbolaData data) {
    	if (securityContext.getUserPrincipal() == null) {
    		throw new EbolaAuthenticationException("login body method");
    	}
    	EbolaChart chart = new EbolaChart();
    	chart.addRangeItem(1, 0, 10);
    	chart.addRangeItem(2, 2, 13);
    	chart.addRangeItem(3, 5, 18);
    	chart.addRangeItem(4, 17, 29);
    	chart.addRangeItem(5, 18, 35);
    	chart.addRangeItem(6, 23, 45);
    	chart.addRangeItem(7, 28, 53);
    	chart.addRangeItem(8, 35, 68);
    	chart.addRangeItem(9, 45, 100);
    	chart.addRangeItem(10, 50, 123);
    	chart.addAverageItem(1, 5);
    	chart.addAverageItem(2, 8);
    	chart.addAverageItem(3, 10);
    	chart.addAverageItem(4, 15);
    	chart.addAverageItem(5, 20);
    	chart.addAverageItem(6, 30);
    	chart.addAverageItem(7, 33);
    	chart.addAverageItem(8, 55);
    	chart.addAverageItem(9, 60);
    	chart.addAverageItem(10, 70);
        return chart;
    }
}
