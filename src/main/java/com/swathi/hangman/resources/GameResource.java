package com.swathi.hangman.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by root on 3/20/16.
 */
@Path("/game")
public class GameResource {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response get() {

        return Response.ok().entity("Hello World").build();
    }

}
