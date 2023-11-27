package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

          features={".//Features/Login.feature"},
           glue="stepdefinitions",
           plugin ={"pretty","html:reports/myreport.html",
        		   "json:reports/myreport.json","rerun:target/rerun.txt"},
           dryRun=false,
           tags="@smoke"
           )
           
//features= {".//Features/"},-- For all featurefiles to execute only mention folder name
//features= {".//Features/Login.feature"},-- For only single file
//features= {".//Features/LoginDDT.feature"}, -- For only single file
//features= {".//Features/LoginDDTExcel.feature"}, -- For only single file
//features= {".//Features/Login.feature",".//Features/AccountRegistration.feature"}, -- For multiple files to execute
//features="@target/rerun.txt",  -- Runs only failures
//glue="stepDefinitions",
//plugin= {"pretty",
       // "html:reports/myreport.html",
        //"json:reports/myreport.json",
        //"rerun:target/rerun.txt",    //Mandatory to capture failures
//}
//dryRun=false,
//monochrome=true, ---For unwanted characters in console
//tags = "@sanity"	//Scenarios tagged with @sanity,
//tags = "@sanity and @regression"	//Scenarios tagged with both @sanity and @regression
//tags = "@sanity or @regression"	 //Scenarios tagged with either @sanity or @regression
//tags = "@sanity and not @regression", //Scenarios tagged with @sanity but not tagged with @regression


public class TestRunclass {

}
