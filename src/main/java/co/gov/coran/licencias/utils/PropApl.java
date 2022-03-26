package co.gov.coran.licencias.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropApl {
    private Properties properties;
    private static PropApl propApl = new PropApl();

    public PropApl(){
        properties = new Properties();
        try {
            try(InputStream ins = this.getClass().getResourceAsStream("/propapl.properties")){
                properties.load(ins);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PropApl getInstance(){
        return propApl;
    }

    public static boolean isDebug(){
        //TODO: Validar que hace
        return true;
    }

    public String get(String  propName){
        return properties.getProperty(propName);
    }
}
