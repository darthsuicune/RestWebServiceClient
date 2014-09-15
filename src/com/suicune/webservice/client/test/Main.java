package com.suicune.webservice.client.test;

import com.suicune.webservice.client.BasicRestWebServiceClient;
import com.suicune.webservice.client.RestWebServiceClient;
import com.suicune.webservice.client.WebServiceResponseListener;
import com.suicune.webservice.client.auth.AuthTokenPostAuthorization;
import com.suicune.webservice.client.auth.UserPasswordHeaderAuthorization;
import com.suicune.webservice.client.server_definition.ServerDefinition;

import org.apache.http.HttpResponse;

import java.io.IOException;

/**
 * Created by lapuente on 09.09.14.
 */
public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		ServerDefinition serverDefinition = null;
		RestWebServiceClient client = new BasicRestWebServiceClient(serverDefinition);
		final WaiterThread runner = new WaiterThread();

		new Thread(runner).start();

		try {
			String asdf = client.withPostAuth(new AuthTokenPostAuthorization("asdf"))
					.getIndex(null).asString();
		} catch (IOException e) {
			e.printStackTrace();
		}

		client.withHeaderAuth(new UserPasswordHeaderAuthorization("",""))
				.getIndexAsync(null, new WebServiceResponseListener() {
							@Override public void onValidResponse(HttpResponse response) {
								runner.isCalled = true;
							}

							@Override public void onRedirectedResponse(int status, String target) {
								runner.isCalled = true;
							}

							@Override public void onErrorResponse(int status,
																  HttpResponse response) {
								runner.isCalled = true;
							}
						}
				);
	}

	public static void print(String string) {
		System.out.println(string);
	}

	private class WaiterThread implements Runnable {
		public boolean isCalled = false;

		@Override public void run() {
			int i = 0;
			while (!isCalled && i < 5) {
				i++;
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
