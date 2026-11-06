package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//cucumber->  TestNG, junit


// features = path of the feature file
// glue = stepdefination file path
// plugin = to genrate html reports & path to store that
// monochrome = result in readabele format
// tags = used to run only those spefied test cases .. this tag is given in feature file
@CucumberOptions(features="src/test/java/cucumber",glue="rahulshettyacademy.stepDefinitions",
monochrome=true, tags = "@Regression", plugin= {"html:target/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests{ 

	
}
