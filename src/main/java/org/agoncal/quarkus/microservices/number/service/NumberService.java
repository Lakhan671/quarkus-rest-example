package org.agoncal.quarkus.microservices.number.service;

import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import org.agoncal.quarkus.microservices.number.model.IsbnNumber;

import java.time.Instant;

/**
 * @author lakhan Singh
 *
 */
@ApplicationScoped
public class NumberService {

    public IsbnNumber getNumbe(){
         return new IsbnNumber("LAKHAN1010101","KUNAL2020202", Instant.now());
    }
}
