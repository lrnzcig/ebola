package com.sisifo.ebola_jersey_server;

import javax.ws.rs.Priorities;

import org.glassfish.jersey.server.ResourceConfig;



public class EbolaApplication extends ResourceConfig {

	public EbolaApplication() {
		super();
		
		register(EbolaAuthenticationRequestFilter.class, Priorities.AUTHENTICATION);
		register(EbolaExceptionMapper.class);
		register(EbolaContainerResponseFilter.class);
		
		packages("com.sisifo.ebola_jersey_server.resources");
	}


}
