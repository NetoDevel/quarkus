package io.quarkus.oidc.client.reactive.filter;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/oidc-client")
public class OidcClientResource {

    @Inject
    @RestClient
    ProtectedResourceServiceAnnotationOidcClient protectedResourceServiceAnnotationOidcClient;

    @Inject
    @RestClient
    ProtectedResourceServiceConfigPropertyOidcClient protectedResourceServiceConfigPropertyOidcClient;

    @Inject
    @RestClient
    ProtectedResourceServiceCustomProviderConfigPropOidcClient protectedResourceServiceCustomProviderConfigPropOidcClient;

    @GET
    @Path("/annotation/user-name")
    public String annotationUserName() {
        return protectedResourceServiceAnnotationOidcClient.getUserName();
    }

    @GET
    @Path("/config-property/user-name")
    public String configPropertyUserName() {
        return protectedResourceServiceConfigPropertyOidcClient.getUserName();
    }

    @GET
    @Path("/custom-provider-config-property/user-name")
    public String customProviderConfigPropertyUserName() {
        return protectedResourceServiceCustomProviderConfigPropOidcClient.getUserName();
    }
}
