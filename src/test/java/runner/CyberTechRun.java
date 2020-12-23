package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 

@CucumberOptions(features={"C:\\Users\\lakmi\\DecInternshipCyberTech\\src\\main\\java\\features"},
				glue={"step_definitions"},
                plugin = {"pretty"})


public class CyberTechRun {

}



