package demo.utils;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesReader {
    
    public static Properties getProperties(File propFile) {
        Properties result = new Properties();
        try {
            result.load(new FileReader(propFile));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}