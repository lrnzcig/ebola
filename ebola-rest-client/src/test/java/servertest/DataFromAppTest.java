package servertest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.junit.Assert;
import org.junit.Test;

import ebola_rest_client.utils.ClientUtils;
import xre.EbolaAppData;

public class DataFromAppTest {

	@Test
	public void submitData() {
		Client client = ClientUtils.getClientWithAuthenticationAndJackson();

		String app = "Bubble breaker";
		Response response = client.target("http://localhost:8080/ebola-jersey-server/webapi").path("data-from-app").request()
				.property(HttpAuthenticationFeature.HTTP_AUTHENTICATION_BASIC_USERNAME, "kk")
				.property(HttpAuthenticationFeature.HTTP_AUTHENTICATION_BASIC_PASSWORD, "pass")
				.put(Entity.entity(app, MediaType.APPLICATION_JSON));
		Assert.assertEquals(200, response.getStatus());
		EbolaAppData data = response.readEntity(EbolaAppData.class);
		System.out.println(data.getChart().getRanges().length);
		System.out.println(data.getChart().getAverages().length);
		System.out.println(data.getDataTable().getIths().length);
		System.out.println(data.getDataTable().getNums().length);
	}
}
