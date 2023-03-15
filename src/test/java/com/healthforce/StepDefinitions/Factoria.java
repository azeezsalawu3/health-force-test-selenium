package com.healthforce.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.healthforce.DataFactory.WebDataFactory;
import com.healthforce.HandlerClasses.BaseClass;
import com.healthforce.PageObjects.FactoriaPageObject;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class Factoria extends BaseClass {

    private Logger log = Logger.getLogger(Factoria.class.getName());
    private FactoriaPageObject factoriaPageObject = PageFactory.initElements(driver, FactoriaPageObject.class);

    @Given("user navigates the application")
    public void user_navigates_to_the_base_url() {
        driver.get(WebDataFactory.baseUrl);
    }

    @And("user clicks on calculate button")
    public void user_clicks_on_the_calculate_button(){
        factoriaPageObject.calculateButton.click();
    }

    @When("user finds the red highlighted form validation")
    public void user_finds_the_red_highlighted_form_validation() {
        Assert.assertTrue(factoriaPageObject.redFormStyling.isDisplayed());
    }

    @And("user finds the result text and validate that result is {string}")
    public void user_finds_the_result_text_and_validates(String expectedResultText){
        String resultText = factoriaPageObject.resultText.getText();
        Assert.assertEquals(expectedResultText, resultText);
    }

    @And("user enters {string} in the text field")
    public void userEntersInTheTextField(String factor) {
        factoriaPageObject.factorTextField.sendKeys(factor);
    }

    @And("I print out the headers and parameters sent in the request")
    public void iPrintOutTheHeadersAndParametersSentInTheRequest() {
        Logs logs = driver.manage().logs();
        System.out.println(logs.getAvailableLogTypes());
    }
}
