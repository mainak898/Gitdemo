package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	
        System.out.println("Gholu");
    }


    @When("^User login to application using username=\"([^\"]*)\" and password=\"([^\"]*)\"$")
    public void user_login_to_application_using_usernamesomething_and_passwordsomething(String strArg1, String strArg2) throws Throwable {
        
    	
       System.out.println(strArg1+ strArg2);
    }

    @And("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
       
    	System.out.println("Cholu");
    }

    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }



}