package com.tinder.Test;


import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TinderTest extends CommonMethods {
	
	CommonMethods common;
	
	@Before
	public void connection() {
		common=new CommonMethods();
	}
	@After
	public void tearDown()	{
		common.closeConnection();
	}
	
	@Given("^user opens Tinder application$")
	public void user_opens_Tinder_application() throws MalformedURLException {
	    common.setUp();
	}
	@Then("^user clicks connect-with-facebook-button$")
	public void user_clicks_connect_with_facebook_button() {
	   common.click(By.id("com.tinder:id/real_facebook_login_button"));
	}
	@Then("^user allows the applicaton to use the location feature$")
	public void user_allows_the_applicaton_to_use_the_location_feature() {
		 common.waitAndClick(By.id("com.tinder:id/requestPermissionButton"));
		 common.waitAndClick(By.id("com.android.packageinstaller:id/permission_allow_button"));
	}
	@Then("^user is on the main page waits for a profile recommendation$")
	public void user_is_on_the_main_page_waits_for_a_profile_recommendation() {
		common.waitForAProfile(By.xpath("//android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]"));
	}
	@When("^a profile appears, user starts liking all recommended profiles$")
	public void a_profile_appears_user_starts_liking_all_recommended_profiles() {
		common.clickLike(By.id("com.tinder:id/gamepad_like"));
	}	
	@When("^it comes to the last profile, the total number of the likes is checked$")
	public void it_comes_to_the_last_profile_the_total_number_of_the_likes_is_checked() {
		assertEquals(99,common.totalnumber);
	}


	
	
}
