package main.java.io.friendlycoconut;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
@Path("/avenger")
public class AvengerResource {

    @GET
    public List<?> getAll() {
        return List.of();
    }
}
