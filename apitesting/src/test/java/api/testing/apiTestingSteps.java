package api.testing;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import org.json.*;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.get;


public class apiTestingSteps {
	private Response resp;
	private String capital;
	private String url;
	
	@Given("^there is an api to find the capital of a country$")
	public void there_is_an_api_to_find_the_capital_of_a_country() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		url ="http://restcountries.eu/rest/v1/name/turkey";	
	    
	}

	@When("^I send the company$")
	public void i_send_the_company() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		resp = get(url);
		JSONArray jsonResponse = new JSONArray(resp.asString());
		System.out.println(resp.asString());
		capital = jsonResponse.getJSONObject(0).getString("capital");
	    System.out.println("capital");
	    
	}

	@Then("^I will get the capital$")
	public void i_will_get_the_capital() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(capital,"Ankara");
	}

}
