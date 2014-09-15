package com.suicune.webservice.client.server_definition;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

import java.io.IOException;

/**
 * Created by lapuente on 15.09.14.
 */
public interface Action {
	public String getPath();
	public HttpResponse execute() throws IOException;
	public HttpResponse execute(HttpClient httpClient) throws IOException;
}
