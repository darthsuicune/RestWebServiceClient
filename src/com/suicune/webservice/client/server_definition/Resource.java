package com.suicune.webservice.client.server_definition;

import org.apache.http.HttpResponse;

import java.io.IOException;
import java.util.List;

/**
 * Created by lapuente on 15.09.14.
 */
public interface Resource {
	public String getPath();
	public List<Action> getActions();
	public HttpResponse execute(Action action) throws IOException;
}
