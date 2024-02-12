package org.agoncal.quarkus.microservices.number.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.Instant;

/**
 * @author lakhan Singh
 *
 */
@Schema(description = "multiple isbn numbers")
public record IsbnNumber( @Schema(required  = true) String isbn10, @Schema(readOnly = true)String isbn, Instant date) {
}
