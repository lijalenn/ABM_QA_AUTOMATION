package utilites.for_properties_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertieFiles {
    private Properties properties;
    private String proFileLocationPath = ""; // this is a sample path  "./src/test/resources/config/config.properties"

    /**
     * This method is used to load the properties from config.properties file
     * @return it returns Properties prop object
     */
    public Properties usePropHelp() {

        properties = new Properties();
        try {
            FileInputStream input = new FileInputStream(proFileLocationPath);
            properties.load(input);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties;

    }
}
