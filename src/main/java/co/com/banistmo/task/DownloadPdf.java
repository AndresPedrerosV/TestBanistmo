package co.com.banistmo.task;

import co.com.banistmo.userInterfaces.ProveedoresPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DownloadPdf implements Task {

    String section;

    public DownloadPdf(String section) {
        this.section = section;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProveedoresPage.BTN_DOWNLOAD.of(section)));
    }

    public static DownloadPdf click(String section){
        return Tasks.instrumented(DownloadPdf.class, section);
    }
}
