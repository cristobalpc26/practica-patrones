/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Carlos
 */
public class Validaciones {

    public static boolean esValidoNumeroTelefono(String tfno) {

        Pattern p = Pattern.compile("^[679]\\d{8}$");

        Matcher m = p.matcher(tfno);

        return (m.matches());
    }

    public static boolean validarDNI(String dni) {
        Pattern patron = Pattern.compile("[0-9]{8}[A-Z]"); // expresion regular que tiene que encajar con el dni introducido
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";// Cadena con las letras del dni
        return patron.matcher(dni).matches() // Comprobamos que el dni introducido cumple la expresion regular
                && dni.charAt(8) == letras.charAt(Integer.parseInt(dni.substring(0, 8)) % 23); // comprobamos que la letra final sea la asociada con el numero del dni
    }

    public static boolean validarCorreo(String correo) {
        Pattern p = Pattern.compile("^[\\w!#Ññ$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        Matcher m = p.matcher(correo);

        return (m.matches());

    }
}
