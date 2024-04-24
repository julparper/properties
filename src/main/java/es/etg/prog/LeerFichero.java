package es.etg.prog;

import java.io.FileInputStream;
import java.util.Properties;

public class LeerFichero {

    public static void main(String[] args) throws Exception{
        Properties properties= new Properties();
        properties.load(new FileInputStream("config.properties"));
        System.out.println(properties.get("MODULO"));
        System.out.println(properties.get("CURSO"));
    }
}