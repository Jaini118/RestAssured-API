package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties props = new Properties();

    static {
        String env = System.getProperty("env", "qa").toLowerCase(); // default to QA
        String path = String.format("src/test/resources/config/config.%s.properties", env);

        try (InputStream input = new FileInputStream(path)) {
            props.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Could not load config file: " + path);
        }
    }

    public static String getProperty(String key) {
        return props.getProperty(key);
    }
}