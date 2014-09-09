package com.suicune.webservice.client;

import com.suicune.webservice.client.requests.RestRequest;
import com.suicune.webservice.client.server_definition.ServerDefinition;

import org.apache.http.HttpResponse;

/**
 * Created by lapuente on 09.09.14.
 */
public class RestWebServiceClientImpl extends RestWebServiceClient {
	private ServerDefinition mServerDefinition;
	public RestWebServiceClientImpl(ServerDefinition serverDefinition) {
		mServerDefinition = serverDefinition;
	}

	@Override public HttpResponse get(RestRequest request) {
		return null;
	}

	@Override public HttpResponse post(RestRequest request) {
		return null;
	}

	@Override public HttpResponse put(RestRequest request) {
		return null;
	}

	@Override public HttpResponse patch(RestRequest request) {
		return null;
	}

	@Override public HttpResponse delete(RestRequest request) {
		return null;
	}
}
