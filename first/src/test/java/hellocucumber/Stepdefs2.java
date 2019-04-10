package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

class IsItTuesday {
    static String isItTuesday(String today) {
        if (today.equals("Tuesday")) {
            return "TGIF";
        }
        return "Nope";
    }
}

public class Stepdefs2 {
    private String today;
    private String actualAnswer;

    @Given("^today is \"([^\"]*)\"")
    public void today_is(String today) {
        this.today = today;
    }

    @When("^I ask whether it's Tuesday yet$")
    public void i_ask_whether_it_s_Friday_yet() {
        this.actualAnswer = IsItTuesday.isItTuesday(today);
    }

    @Then("^I must be told \"([^\"]*)\"")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
