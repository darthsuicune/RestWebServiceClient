package com.suicune.webservice.client.auth;

import org.apache.http.client.methods.HttpUriRequest;

/**
 * Created by lapuente on 11.09.14.
 */
public class UserPasswordHeaderAuthorization implements HeaderAuthorization {
	private String mUsername;
	private String mPassword;

	public UserPasswordHeaderAuthorization(String username, String password) {
		mUsername = username;
		mPassword = password;
	}

	@Override public HttpUriRequest addAuthTo(HttpUriRequest request) {
		return null;
	}
}
