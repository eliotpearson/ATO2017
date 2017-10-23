package ms.lucina.conless;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * State resource (exposed at "state" path)
 */
@Path("state")
public class StateResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String lookup(@QueryParam("zipcode") String zipcode) {
        return Main.zipcodeProperties.getProperty(zipcode);
    }
}
