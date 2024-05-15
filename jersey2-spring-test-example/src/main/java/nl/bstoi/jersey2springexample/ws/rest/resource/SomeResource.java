package nl.bstoi.jersey2springexample.ws.rest.resource;

import nl.bstoi.jersey2springexample.service.SomeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Component // Required for using Spring and Jersey2
@Path("someaction")
public class SomeResource {

    private final static Log LOG = LogFactory.getLog(SomeResource.class);

    private SomeService someService; // Service we want to mock

    @GET
    public Response doSomething(){
        LOG.debug("SomeResource was called");
        getSomeService().doSomething();
        return Response.ok("Hello from status").build();
    }

    @GET
    @Path("/date")
    public Response date(@BeanParam QueryParams queryParams) {
        LOG.debug("SomeResource - date was called with " + queryParams);
        return Response.ok("SomeResource - date was called with " + queryParams).build();
    }

    public SomeService getSomeService() {
        return someService;
    }

    public void setSomeService(SomeService someService) {
        this.someService = someService;
    }
}
