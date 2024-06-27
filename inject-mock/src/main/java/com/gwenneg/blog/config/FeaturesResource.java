package com.gwenneg.blog.config;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/features")
public class FeaturesResource {

    @Inject
    FeaturesConfigMapping featuresConfigMapping;

    @Inject
    FeaturesConfig featuresConfig;

    @GET
    @Path("/awesome")
    public boolean isAwesomeFeatureEnabled() {
        return featuresConfigMapping.awesomeFeatureEnabled();
    }

    @GET
    @Path("/amazing")
    public boolean isAmazingFeatureEnabled() {
        return featuresConfigMapping.amazingFeatureEnabled();
    }

    @GET
    @Path("/fantastic")
    public boolean isFantasticFeatureEnabled() {
        return featuresConfig.isFantasticFeatureEnabled();
    }
}
