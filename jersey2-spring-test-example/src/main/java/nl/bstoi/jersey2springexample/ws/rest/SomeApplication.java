package nl.bstoi.jersey2springexample.ws.rest;

import nl.bstoi.jersey2springexample.ws.rest.resource.SomeResource;
import org.glassfish.jersey.server.ResourceConfig;

public class SomeApplication extends ResourceConfig {
    public SomeApplication() {
        packages(SomeResource.class.getPackage().toString());
        register(DateParamConverterProvider.class);
    }
}
