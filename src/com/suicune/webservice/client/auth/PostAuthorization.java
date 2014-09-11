package com.suicune.webservice.client.auth;

import org.apache.http.client.methods.HttpPost;

/**
 * Created by lapuente on 11.09.14.
 */
public interface PostAuthorization {
	public HttpPost addAuthTo(HttpPost request);
}
