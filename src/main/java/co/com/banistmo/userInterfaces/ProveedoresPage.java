package co.com.banistmo.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProveedoresPage {

    public static final Target BTN_DOWNLOAD = Target.the("Click to download pdf")
            .locatedBy("//div[@class ='col-sm-6 izquierda' ][.//h2[text()='{0}']]//a[@class='btn btn-primary']");
}
