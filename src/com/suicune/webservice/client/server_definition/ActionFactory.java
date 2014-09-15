package com.suicune.webservice.client.server_definition;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

/**
 * Created by lapuente on 15.09.14.
 */
public class ActionFactory {
	public static Action build(final String path){
		return new Action() {
			@Override public String getPath() {
				return path;
			}

			@Override public HttpResponse execute() throws IOException {
				return execute(new DefaultHttpClient());
			}

			@Override public HttpResponse execute(HttpClient client) throws IOException {
				HttpUriRequest request = new HttpGet();
				//TODO: Replace with getting the actual request
				return client.execute(request);
			}
		};
	}
}
