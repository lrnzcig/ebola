package servertest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.junit.Assert;
import org.junit.Test;

import ebola_rest_client.utils.ClientUtils;
import xre.EbolaChart;
import xre.EbolaDataTable;

public class SubmitDataTest {

	@Test
	public void submitData() {
		Client client = ClientUtils.getClientWithAuthenticationAndJackson();

		Integer[] iths = new Integer[8];
		iths[0] = 1;
		Integer[] nums = new Integer[8];
		nums[0] = 83;
		EbolaDataTable data = new EbolaDataTable(iths, nums, "Bubble breaker");

		Response response = client.target("http://localhost:8080/ebola-jersey-server/webapi").path("submit-data").request()
				.property(HttpAuthenticationFeature.HTTP_AUTHENTICATION_BASIC_USERNAME, "kk")
				.property(HttpAuthenticationFeature.HTTP_AUTHENTICATION_BASIC_PASSWORD, "pass")
				.put(Entity.entity(data, MediaType.APPLICATION_JSON));
		Assert.assertEquals(200, response.getStatus());
		EbolaChart chart = response.readEntity(EbolaChart.class);
		System.out.println(chart.getRanges().length);
		System.out.println(chart.getAverages().length);
	}
}
