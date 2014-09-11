package com.suicune.webservice.client.auth;

import org.apache.http.client.methods.HttpUriRequest;

/**
 * Created by lapuente on 11.09.14.
 */
public class AuthTokenHeaderAuthorization implements HeaderAuthorization {
	private String mAuthToken;
	public AuthTokenHeaderAuthorization(String authToken) {
		mAuthToken = authToken;
	}

	@Override public HttpUriRequest addAuthTo(HttpUriRequest request) {
		return null;
	}
}
