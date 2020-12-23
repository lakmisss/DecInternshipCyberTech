package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Blogpage;

public class SearchStep {
	
Blogpage Sea;
	
SearchStep(){
			super();
			Sea = new Blogpage();
    }	

	@Given ("user enter the home page url")
	public void user_enter_the_home_page_url() {
	
	}

	@When("user click Blog link in home Page")
	public void user_click_Blog_link_in_home_Page() {
	
	}
	
	@Then("User select WordPress from All Categories")
	public void user_select_word_press_from_all_categories() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("User select Certificate from All Tags")
	public void user_select_certificate_from_all_tags() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Click Search button")
	public void user_click_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Click the Reset button")
	public void user_click_the_reset_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
