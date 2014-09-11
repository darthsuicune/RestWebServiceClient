package com.suicune.webservice.client.auth;

import org.apache.http.client.methods.HttpPost;

/**
 * Created by lapuente on 11.09.14.
 */
public class UserPasswordPostAuthorization implements PostAuthorization {
	private String mUsername;
	private String mPassword;

	public UserPasswordPostAuthorization(String username, String password) {
		mUsername = username;
		mPassword = password;
	}

	@Override public HttpPost addAuthTo(HttpPost request) {
		return null;
	}
}
