package example;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context; 

public class AreaCodeLookup implements RequestHandler<String, String> {
    
    public String handleRequest(String request, Context context) {
        return "Hi";
    }
}
