package Configclass;

import Constants.ConstantsClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigClass {

    public static Map<Object, Object> setProperties() throws IOException {
        Map<Object, Object> map = new HashMap();
        FileReader fileReader = new FileReader(ConstantsClass.CONFIG_PROPERTIES_PATH);
        Properties properties = new Properties();
        properties.load(fileReader);
        for (String keyName : properties.stringPropertyNames()) {
            map.put(keyName, properties.getProperty(keyName));
        }
        return
                map;
    }
}
