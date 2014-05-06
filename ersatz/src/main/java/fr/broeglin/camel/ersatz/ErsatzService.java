package fr.broeglin.camel.ersatz;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

public class ErsatzService {
	@GET
	@Path("/{id}")
	public Response test(@PathParam("id") String id,
			@QueryParam("active") @DefaultValue("true") boolean active) {
		return Response.ok("SHOULD NEVER APPEAR").build();
	}
}
