package org.edudev;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/api")
@Produces(APPLICATION_JSON)
public class MyRemoteService {

    @GET
    @Path("/test")
   public Test returnSimpleData() {
        return new Test();
    };

    class Test {
        public String title = "Hi from Eduardo J";
        public String description = "Quarkus in AWS!";
    }
}
