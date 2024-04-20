package stepDefinitations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("User is on Netbanking Login page")
	public void user_is_on_netbanking_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // here you will be calling the selenium method code for - UI automation
		System.out.println("User is on Netbanking Login page");
		
	}
	@When("User Login into application")
	public void user_login_into_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User Login into application");
	   
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home Page is displayed");
	    
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	}
	
	@When("User Login into application as user (.+) with password (.+)$")
	public void user_login_into_application_as_user_with_password(String userName, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("UserName :"+ userName + " | Password :"+password);
	}
	
	@Then("morgage Cards are displayed")
	public void morgage_cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("morgage Cards are displayed");
	   
	}
	@Then("admin Cards are displayed")
	public void admin_cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("admin Cards are displayed");
	}
	
	@Then("home loan Cards are displayed")
	public void home_loan_cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("home loan Cards are displayed");
	}
	
	
	@Given("User is on Facebook account creation page")
	public void user_is_on_facebook_account_creation_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on Facebook account creation page");
	}
	
	//for using data table
	@Then("user creates an account")
	public void user_creates_an_account(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
		
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		ArrayList<String> fieldName = new ArrayList<String>();
		ArrayList<String> fieldValue = new ArrayList<String>();
		
		for(Map<String, String> vals: list) {
			fieldName.add(vals.get("FieldName"));
			fieldValue.add(vals.get("FieldValues"));
		}
		
		System.out.println( "FieldNames : "+String.join(",", fieldName));
		System.out.println( "FieldValues : "+String.join(",", fieldValue));
		 
	}
	//for using List
	@Then("user enter values as list")
	public void user_enter_values_as_list(List<String> values) {
	    // Write code here that turns the phrase above into concrete actions
	    
		for( String s : values) {
			System.out.println(s);
		}
	    
	}
	
	@Given("setup the entries in database")
	public void setup_the_entries_in_database() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("--------bacground start --------");
		System.out.println("setup the entries in database");
	}
	@Given("launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("launch the browser from config variables");
	}
	@Given("hit the home page of banking url")
	public void hit_the_home_page_of_banking_url() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("hit the home page of banking url");
	    System.out.println("--------bacground end --------");
	}


}
