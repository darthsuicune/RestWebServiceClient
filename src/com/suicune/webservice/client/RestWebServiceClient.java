package com.suicune.webservice.client;

import com.suicune.webservice.client.auth.HeaderAuthorization;
import com.suicune.webservice.client.auth.PostAuthorization;
import com.suicune.webservice.client.server_definition.Action;
import com.suicune.webservice.client.server_definition.Resource;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;

import java.io.IOException;

/**
 * Created by lapuente on 09.09.14.
 */
public interface RestWebServiceClient {

	public HttpResponse getAuthToken(String username, String password);

	public HttpUriRequest addAuthTo(HttpUriRequest request, HeaderAuthorization auth);

	public HttpPost addAuthTo(HttpPost request, PostAuthorization auth);

	public RestWebServiceClient withPostAuth(PostAuthorization auth);

	public RestWebServiceClient withHeaderAuth(HeaderAuthorization auth);

	public WebServiceResponse run(Resource resource, Action action) throws IOException;

	public WebServiceResponse runAsync(Resource resource, Action action,
									   WebServiceResponseListener listener);
}
