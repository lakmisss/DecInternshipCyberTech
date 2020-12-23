package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Blogpage;

public class ResetStep {
	Blogpage Res;
	
	ResetStep(){
			super();
			Res = new Blogpage();
	}
		@Given ("user enter the home page url")
		public void user_enter_the_home_page_url() {
			
		}
		
		@When("user click Blog link in home Page")
		public void user_click_Blog_link_in_home_Page() {
			
		}
		
		@When("User select <allCategories> Dropdown")
		public void user_select_all_categories_dropdown() {
	   
	}

		@And("User select <alltags> Dropdown")
		public void user_select_alltags_dropdown() {
	    
	}

		@And("User click on reset button")
		public void user_click_on_reset_button() {
	   
		}

		@Then("User should be able to reset the selections")
		public void user_should_be_able_to_reset_the_selections() {
	   
	}


}
