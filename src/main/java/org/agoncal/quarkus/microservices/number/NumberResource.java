package org.agoncal.quarkus.microservices.number;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;
import org.agoncal.quarkus.microservices.number.model.IsbnNumber;
import org.agoncal.quarkus.microservices.number.service.NumberService;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

/**
 * @author lakhan Singh
 *
 */
@Path("/api/numbers")
@Slf4j
@Produces(MediaType.APPLICATION_JSON)
@Tag(name="Number Rest endpoint")
public class NumberResource {
    @Inject
 private NumberService numberService;
    @GET
    @Operation(summary = "Get request to get the isbn number")
    public IsbnNumber getIsbnNumber() {
        log.info("testing");
       return numberService.getNumbe();
    }
}
