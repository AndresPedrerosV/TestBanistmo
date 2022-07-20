package co.com.banistmo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {

    long delay = 1000L;

    public Wait(long delay) {
        this.delay = delay;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static Wait On(long delay){
        return Tasks.instrumented(Wait.class, delay);
    }
}
