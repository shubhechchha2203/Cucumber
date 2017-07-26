package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features={"src/test/resources/Features/login.feature"},
glue={"src/test/java/StepDefinition/login_stepdefinition.java"})
public class Login {

}
