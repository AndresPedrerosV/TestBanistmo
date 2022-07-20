package co.com.banistmo.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SwitchPage implements Task {

    public <T extends Actor> void performAs(T actor) {
        String currentWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();
        for(String window : allWindows){
            if(!window.contentEquals(currentWindow))
            {
                getDriver().switchTo().window(window);
                break;
            }
        }
    }

    public static SwitchPage on(){
        return Instrumented.instanceOf(SwitchPage.class).withProperties();
    }
}