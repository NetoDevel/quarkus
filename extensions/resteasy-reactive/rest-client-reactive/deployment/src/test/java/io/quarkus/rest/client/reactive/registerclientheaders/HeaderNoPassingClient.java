package io.quarkus.rest.client.reactive.registerclientheaders;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.quarkus.rest.client.reactive.TestJacksonBasicMessageBodyReader;

@RegisterRestClient
@RegisterProvider(TestJacksonBasicMessageBodyReader.class)
public interface HeaderNoPassingClient {

    @GET
    @Path("/describe-request")
    RequestData call();

}
