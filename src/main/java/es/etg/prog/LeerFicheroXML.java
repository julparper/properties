package es.etg.prog;

import java.io.FileInputStream;
import java.util.Properties;

public class LeerFicheroXML {

    public static void main(String[] args) throws Exception{
        Properties properties= new Properties();
        properties.loadFromXML(new FileInputStream("config.xml"));
        System.out.println(properties.get("MODULO"));
        System.out.println(properties.get("CURSO"));
    }
}