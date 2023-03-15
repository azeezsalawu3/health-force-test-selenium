package com.healthforce;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features"},
        publish = true,
        glue = {"com.healthforce.StepDefinitions"},
        monochrome = true)


public class Runner {

}