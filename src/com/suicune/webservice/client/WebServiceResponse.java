package com.suicune.webservice.client;

import org.apache.http.HttpResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by lapuente on 11.09.14.
 */
public class WebServiceResponse {
	HttpResponse mResponse;

	public WebServiceResponse(HttpResponse response) {
		mResponse = response;
	}

	public int getStatus() {
		return mResponse.getStatusLine().getStatusCode();
	}

	/**
	 * WARNING: This consumes the content. The input stream becomes closed after using.
	 *
	 * @return
	 */
	public String asString() throws IOException {
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(mResponse.getEntity().getContent()));
		StringBuilder builder = new StringBuilder();
		String line = reader.readLine();
		while (line != null) {
			builder.append(line);
			reader.readLine();
		}
		return builder.toString();
	}

	public InputStream asStream() throws IOException {
		return mResponse.getEntity().getContent();
	}
}
