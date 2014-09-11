package com.suicune.webservice.client.auth;

import org.apache.http.client.methods.HttpUriRequest;

/**
 * Created by lapuente on 11.09.14.
 */
public interface HeaderAuthorization {
	public HttpUriRequest addAuthTo(HttpUriRequest request);

}
