package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.GWD;


public class Hooks {
    @After
    public void after(Scenario scenerio){
        System.out.println("The scenerio has finished");

        if (scenerio.isFailed()){
            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
            byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            scenerio.attach(hafizadakiHali, "image/png","screen shot");
        }
        GWD.quitDriver();
    }
}
