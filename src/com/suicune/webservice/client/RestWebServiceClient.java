package com.suicune.webservice.client;

import com.suicune.webservice.client.requests.RestRequest;

import org.apache.http.HttpResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lapuente on 09.09.14.
 */
public abstract class RestWebServiceClient {
	public abstract HttpResponse get(RestRequest request);

	public abstract HttpResponse post(RestRequest request);

	public abstract HttpResponse put(RestRequest request);

	public abstract HttpResponse patch(RestRequest request);

	public abstract HttpResponse delete(RestRequest request);

	public static String getAsString(HttpResponse response) throws IOException {
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		StringBuilder builder = new StringBuilder();
		String line = reader.readLine();
		while(line != null) {
			builder.append(line);
			reader.readLine();
		}
		return builder.toString();
	}
}
