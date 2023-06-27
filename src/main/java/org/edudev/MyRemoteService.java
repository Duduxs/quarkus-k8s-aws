package org.edudev;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;
import java.util.Set;

/**
 * To use it via injection.
 * <p>
 * {@code
 *
 * @Inject
 * @RestClient MyRemoteService myRemoteService;
 * <p>
 * public void doSomething() {
 * Set<MyRemoteService.Extension> restClientExtensions = myRemoteService.getExtensionsById("io.quarkus:quarkus-rest-client");
 * }
 * }
 */
@RegisterRestClient(baseUri = "http://localhost:8090/api")
public interface MyRemoteService {

    @GET
    @Path("/extensions")
    Set<Extension> getExtensionsById(@QueryParam("id") String id);

    @GET
    @Path("hi")
    Test returnSimpleData();

    class Test {
        public String title = "Hi from Eduardo J";
        public String description = "Quarkus in AWS!";
    }

    class Extension {
        public String id;
        public String name;
        public String shortName;
        public List<String> keywords;
    }
}
