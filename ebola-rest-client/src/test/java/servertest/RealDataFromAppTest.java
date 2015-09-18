package servertest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.junit.Assert;
import org.junit.Test;

import ebola_rest_client.utils.ClientUtils;
import xre.EbolaDataTable;

public class RealDataFromAppTest {

	@Test
	public void submitData() {
		Client client = ClientUtils.getClientWithAuthenticationAndJackson();

		String app = "Bubble breaker";
		EbolaDataTable inputData = new EbolaDataTable(new Integer[] {1, 2}, new Integer[] {1, 2}, app);
		Response response = client.target("http://localhost:8080/ebola-jersey-server/webapi").path("get-real-data").request()
				.property(HttpAuthenticationFeature.HTTP_AUTHENTICATION_BASIC_USERNAME, "kk")
				.property(HttpAuthenticationFeature.HTTP_AUTHENTICATION_BASIC_PASSWORD, "pass")
				.put(Entity.entity(inputData, MediaType.APPLICATION_JSON));
		Assert.assertEquals(200, response.getStatus());
		EbolaDataTable data = response.readEntity(EbolaDataTable.class);
		System.out.println(data.getIths().length);
		System.out.println(data.getNums().length);
	}

	@Test
	public void submitDataWithMoreInputs() {
		Client client = ClientUtils.getClientWithAuthenticationAndJackson();

		String app = "Bubble breaker";
		EbolaDataTable inputData = new EbolaDataTable(new Integer[] {1, 2, 3}, new Integer[] {1, 2, 3}, app);
		Response response = client.target("http://localhost:8080/ebola-jersey-server/webapi").path("get-real-data").request()
				.property(HttpAuthenticationFeature.HTTP_AUTHENTICATION_BASIC_USERNAME, "kk")
				.property(HttpAuthenticationFeature.HTTP_AUTHENTICATION_BASIC_PASSWORD, "pass")
				.put(Entity.entity(inputData, MediaType.APPLICATION_JSON));
		Assert.assertEquals(200, response.getStatus());
		EbolaDataTable data = response.readEntity(EbolaDataTable.class);
		System.out.println(data.getIths().length);
		System.out.println(data.getNums().length);
	}

}
