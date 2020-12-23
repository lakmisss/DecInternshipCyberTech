package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Blogpage;
import techBase.BaseClass;

public class EducationStep extends BaseClass{
	
		
	Blogpage Edu;
	
 EducationStep(){
		super();
		Edu = new Blogpage();
}
	
	@Given("User enter the home page url")
	public void user_enter_the_home_page_url() {
	    
	}

	@When("user click Blog link in the Home Page")
	public void user_click_blog_link_in_the_home_page() {
	  
	}

	@Then("Click on All Categories")
	public void click_on_all_categories() {
	  
	}

	@Then("Select Education from All Categories")
	public void select_education_from_all_categories() {
	 
	}

	@Then("click on Search Button")
	public void click_on_search_button() {
	  
	}


}
