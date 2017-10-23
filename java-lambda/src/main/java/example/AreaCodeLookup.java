package example;

import java.io.InputStream;
import java.util.Properties;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class AreaCodeLookup implements RequestHandler<String, String> {
    public static Properties zipcodeProperties;
  
    @Override
    public String handleRequest(String input, Context context) {
      
      try {
        loadSettings("zipcode.properties");
        
        return zipcodeProperties.getProperty(input);
      } catch (Exception e) {
        e.printStackTrace();
      }

      return "some problem occured!";
    }
    
    private static void loadSettings(String filename) throws Exception {
      InputStream is = AreaCodeLookup.class.getClassLoader().getResourceAsStream(filename);
      zipcodeProperties = new Properties();
      zipcodeProperties.load(is);
    }
}
