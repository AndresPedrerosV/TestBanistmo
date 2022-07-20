package co.com.banistmo.stepdefinitions;

import co.com.banistmo.questions.ValidationPdf;
import co.com.banistmo.task.DownloadPdf;
import co.com.banistmo.task.EnterProveedores;
import co.com.banistmo.task.SwitchPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class DownloadStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Andres");
        OnStage.theActorInTheSpotlight().whoCan(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Andres enter the proveedores page in Bancolombia\\.com$")
    public void andresEnterTheProveedoresPageInBancolombiaCom() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bancolombia.com/personas/"));
        OnStage.theActorInTheSpotlight().wasAbleTo(EnterProveedores.in());
    }

    @When("^he click on the \"([^\"]*)\" button$")
    public void heClickOnTheButton(String section) {
        OnStage.theActorInTheSpotlight().attemptsTo(DownloadPdf.click(section));
        OnStage.theActorInTheSpotlight().attemptsTo(SwitchPage.on());
    }

    @Then("^he validate the link \"([^\"]*)\"$")
    public void heValidateTheLink(String link) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationPdf.url(),
                Matchers.is(link)));
    }
}
