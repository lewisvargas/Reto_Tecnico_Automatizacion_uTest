package co.com.choucair.automatizacion.utest.stepdefinitions;


import co.com.choucair.automatizacion.utest.model.AcademyUtestData;
import co.com.choucair.automatizacion.utest.questions.Preguntar;
import co.com.choucair.automatizacion.utest.tasks.Abrir;
import co.com.choucair.automatizacion.utest.tasks.Buscar;
import co.com.choucair.automatizacion.utest.tasks.Sesion;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Jose wants to learn mobile applications at the Utest Academy$")
    public void thatJoseWantsToLearnMobileApplicationsAtTheUtestAcademy (List<AcademyUtestData> academyUtestData) throws Exception {
        OnStage.theActorCalled("Jose").wasAbleTo(Abrir.thePage(),
                Sesion.OnThePage(academyUtestData.get(0).getStrUser(), academyUtestData.get(0).getStrPassword()));
    }

    @When("^he search for the course mobile applications utest on the platform of the Utest Academy$")
    public void heSearchForTheCourseMobileApplicationsUtestOnThePlatformOfTheUtestAcademy (List<AcademyUtestData> academyUtestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.the(academyUtestData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called Utest mobile apps$")
    public void heFindsTheCourseCalledUtestMobileApps (List<AcademyUtestData> academyUtestdata) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Preguntar.toThe(academyUtestdata.get(0).getStrCourse())));
    }
}
