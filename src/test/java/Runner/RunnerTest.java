package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerTest {
    @CucumberOptions(

            features = {"src/test/resources"},
            glue= {"StepDefenition"},
            plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"},
            tags = "@Regression1 or @Regression2 or @Regression3"
    )

    public static class run extends AbstractTestNGCucumberTests {
    }
}


