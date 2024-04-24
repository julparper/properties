package es.etg.prog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class EscribirFichero {
    
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("config.properties")) {

            Properties prop = new Properties();

            prop.setProperty("MODULO", "Programación");
            prop.setProperty("CURSO", "2");
            prop.store(output, null);

            System.out.println(prop);

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
