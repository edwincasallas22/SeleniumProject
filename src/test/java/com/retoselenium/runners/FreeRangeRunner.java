package com.retoselenium.runners;

import com.retoselenium.pages.BasePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.retoselenium.stepdefinitions",
        plugin = { "pretty", "html:target/cucumber-reports" },
        tags = "@Courses")
public class FreeRangeRunner {
    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
}
