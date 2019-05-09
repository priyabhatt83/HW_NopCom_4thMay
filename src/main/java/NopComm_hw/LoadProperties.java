package NopComm_hw;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {

    static Properties props;
    static FileInputStream input;
    static String fileName = "TestDataConfig.properties";
    static String fileLocation = "src\\test\\resourses\\TestData\\TestDataConfig,properties";

    public String getProperty(String key){
        props = new Properties();
        try {
            input = new FileInputStream(fileLocation+ fileName);
            props.load(input);
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return props.getProperty(key);
    }

}
