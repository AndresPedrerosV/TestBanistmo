package co.com.banistmo.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target LNK_ACERCA_DE_NOSOTROS = Target.the("He click the link to go to acerca de nosotros")
            .locatedBy("//a[@id = 'header-nosotros' ]");


    public static final Target LNK_INFORMACION = Target.the("He click the link to go to informacion corporativa")
            .locatedBy("//a[@id = 'serv' ]");

    public static final Target LNK_PROVEEDORES = Target.the("He click the link to go to proveedores")
            .locatedBy("//a[text() = 'Proveedores' ]");


}
