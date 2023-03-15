package com.healthforce.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.healthforce.HandlerClasses.BaseClass;

public class WebHooks extends BaseClass {

    @Before("@WebTest")
    public void BeforeScenario(){
        System.out.println("Initializing driver");
        initializeDriver();
    }

    @After("@WebTest")
    public void AfterScenario(){
       driver.quit();
    }
}
