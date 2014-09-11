package com.suicune.webservice.client.auth;

import org.apache.http.client.methods.HttpPost;

/**
 * Created by lapuente on 11.09.14.
 */
public class AuthTokenPostAuthorization implements PostAuthorization {
	private String mAuthToken;

	public AuthTokenPostAuthorization(String authToken) {
		mAuthToken = authToken;
	}

	@Override public HttpPost addAuthTo(HttpPost request) {
		return null;
	}
}
