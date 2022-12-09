package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = ".\\Features\\ecommerce.feature",
        glue="ecommerce_step_defination",
        dryRun=false,
        monochrome=false
        
       )
public class runner_ecommerce {

}
