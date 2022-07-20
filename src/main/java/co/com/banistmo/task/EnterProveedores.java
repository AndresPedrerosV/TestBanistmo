package co.com.banistmo.task;

import co.com.banistmo.interactions.Wait;
import co.com.banistmo.userInterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EnterProveedores implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.LNK_ACERCA_DE_NOSOTROS),
                        Click.on(HomePage.LNK_INFORMACION),
                        Click.on(HomePage.LNK_PROVEEDORES));
    }

    public static EnterProveedores in(){
        return Tasks.instrumented(EnterProveedores.class);
    }
}
