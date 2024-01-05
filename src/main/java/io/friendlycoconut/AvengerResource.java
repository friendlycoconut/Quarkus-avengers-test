package io.friendlycoconut;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
@Path("/avenger")
public class AvengerResource {

    @GET
    public List<?> getAll() {
        return Avenger.listAll();
    }

    @POST
    @Transactional
    public Avenger create(Avenger avenger){
        avenger.persist();
        return avenger;
    }
}
