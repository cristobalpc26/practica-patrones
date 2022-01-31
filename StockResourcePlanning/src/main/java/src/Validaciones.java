/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Carlos
 */
public class Validaciones {

    /*Mediante expresiones regulares en Java comprobamos que los datos insertados cumplen la estructura y el formato que han de tener en la vida real*/
    public static boolean esValidoNumeroTelefono(String tfno) {

        Pattern p = Pattern.compile("^[679]\\d{8}$");

        Matcher m = p.matcher(tfno);

        return (m.matches());
    }
    // Validacion del DNI cuando insertamos un nuevo usuario
    public static boolean validarDNI(String dni) {
        Pattern patron = Pattern.compile("[0-9]{8}[A-Z]"); // expresion regular que tiene que encajar con el dni introducido
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";// Cadena con las letras del dni
        return patron.matcher(dni).matches() // Comprobamos que el dni introducido cumple la expresion regular
                && dni.charAt(8) == letras.charAt(Integer.parseInt(dni.substring(0, 8)) % 23); // comprobamos que la letra final sea la asociada con el numero del dni
    }

    // Validacion del correo que tiene que contener un @ seguido de texto y de un dominio (ej:.com) cuando modificamos o insertamos un nuevo empleado
    public static boolean validarCorreo(String correo) {
        Pattern p = Pattern.compile("^[\\w!#Ññ$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        Matcher m = p.matcher(correo);

        return (m.matches());

    }
    // Validacion de la fecha en formato dd/mm/yy cuando el usuario la introduce en el campo de texto para buscar un producto

    public static boolean validarFechaEsp(String fechaIntroducida) {

        boolean correcto;
        correcto = fechaIntroducida.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/\\d{4}$");
        return correcto;

    }

    // Validacion de la fecha en formato yyyy-mm-dd para la modificacion de los productos
    public static boolean validarFecha(String fechaIntroducida) {

        boolean correcto;
        if (fechaIntroducida.matches("^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$")) {
            correcto = true;
        } else {
            correcto = false;
        }
        return correcto;

    }
    // Validacion de la fecha en formato yyyy-mm-dd para mostrarlo en la tabla cuando se hace una busqueda de un productos¡

    public static boolean validarFechaDateJava(String fechaIntroducida) {

        boolean correcto;
        if (fechaIntroducida.matches("^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$")) {
            correcto = true;
        } else {
            correcto = false;
        }
        return correcto;

    }

    // Validacion del precio para asegurarnos que el insertado sea decimal separado con punto, a la hora de modificar o crear un producto
    public static boolean validarSoloNumerosPrecios(String numeroIntroducido) {
        Pattern p = Pattern.compile("[0-9]+\\.[0-9]+");
        Matcher m = p.matcher(numeroIntroducido);

        return (m.matches());
    }

    // Validacion del stock de un producto para asegurarnos que el insertado sea un numero entero, a la hora de modificar o crear un producto
    public static boolean validarSoloNumerosUnidades(String numeroIntroducido) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(numeroIntroducido);

        return (m.matches());
    }
}
