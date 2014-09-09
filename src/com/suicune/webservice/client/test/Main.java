package com.suicune.webservice.client.test;

import com.suicune.webservice.client.RestWebServiceClient;
import com.suicune.webservice.client.RestWebServiceClientImpl;
import com.suicune.webservice.client.requests.DeleteRequest;
import com.suicune.webservice.client.requests.GetRequest;
import com.suicune.webservice.client.requests.PatchRequest;
import com.suicune.webservice.client.requests.PostRequest;
import com.suicune.webservice.client.requests.PutRequest;
import com.suicune.webservice.client.requests.RestRequest;
import com.suicune.webservice.client.server_definition.ServerDefinition;

import java.io.IOException;

/**
 * Created by lapuente on 09.09.14.
 */
public class Main {
	public static void main(String[] args) {
		ServerDefinition serverDefinition = null;
		RestWebServiceClient client = new RestWebServiceClientImpl(serverDefinition);
		RestRequest request = new GetRequest();
		client.get(request);
		request = new PostRequest();
		client.post(request);
		request = new PutRequest();
		client.put(request);
		request = new PatchRequest();
		client.patch(request);
		request = new DeleteRequest();
		client.delete(request);

		try {
			request = new GetRequest();
			print(RestWebServiceClient.getAsString(client.get(request)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void print(String string) {
		System.out.println(string);
	}
}
