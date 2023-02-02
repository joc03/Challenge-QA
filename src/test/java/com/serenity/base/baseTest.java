package com.serenity.base;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriverService;


@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features = "src/test/resources/features", glue = "com.serenity.base", strict = true)
//@CucumberOptions(features = "src/test/resources/features/ChallengeQA", glue = "com.serenity.base.stepDefinitions")
@CucumberOptions(features = "src/test/resources/features/ChallengeQA")
public class baseTest {


    @BeforeClass
    public static void init() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
    }

    @AfterClass
    public static void end() {

    }

}
