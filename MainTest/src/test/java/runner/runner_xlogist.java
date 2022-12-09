package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = ".\\Features\\xlogist.feature",
        glue="xlogist_step_defination",
        dryRun=false,
        monochrome=true
        
       )
public class runner_xlogist {

}
