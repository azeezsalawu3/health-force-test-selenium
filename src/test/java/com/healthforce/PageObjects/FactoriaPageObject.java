package com.healthforce.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class FactoriaPageObject {

    @FindBy(how = How.ID, using = "getFactorial")
    public WebElement calculateButton;

    @FindBy(how = How.XPATH, using = "//input[contains(@style, \"border: 2px solid red;\")]")
    public WebElement redFormStyling;

    @FindBy(how = How.ID, using = "resultDiv")
    public WebElement resultText;

    @FindBy(how = How.ID, using = "number")
    public WebElement factorTextField;

}
