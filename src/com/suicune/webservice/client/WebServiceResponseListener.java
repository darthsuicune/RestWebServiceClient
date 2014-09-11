package com.suicune.webservice.client;

import org.apache.http.HttpResponse;

/**
 * Created by lapuente on 10.09.14.
 */
public interface WebServiceResponseListener {
	public void onValidResponse(HttpResponse response);
	public void onRedirectedResponse(int status, String target);
	public void onErrorResponse(int status, HttpResponse response);
}
