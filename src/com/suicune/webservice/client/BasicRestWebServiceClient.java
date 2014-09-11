package com.suicune.webservice.client;

import android.os.AsyncTask;

import com.suicune.webservice.client.auth.HeaderAuthorization;
import com.suicune.webservice.client.auth.PostAuthorization;
import com.suicune.webservice.client.server_definition.ServerDefinition;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by lapuente on 09.09.14.
 */
public class BasicRestWebServiceClient implements RestWebServiceClient {
	private ServerDefinition mServerDefinition;
	private HttpClient mHttpClient;

	public BasicRestWebServiceClient(ServerDefinition serverDefinition) {
		super();
		mHttpClient = new DefaultHttpClient();
		mServerDefinition = serverDefinition;
	}

	public BasicRestWebServiceClient(ServerDefinition serverDefinition, HttpClient client) {
		super();
		mServerDefinition = serverDefinition;
		mHttpClient = client;
	}

	@Override public HttpResponse getAuthToken(String username, String password) {
		return null;
	}

	@Override public HttpUriRequest addAuthTo(HttpUriRequest request, HeaderAuthorization auth) {
		return null;
	}

	@Override public HttpPost addAuthTo(HttpPost request, PostAuthorization auth) {
		return null;
	}

	@Override public RestWebServiceClient withPostAuth(PostAuthorization auth) {
		return null;
	}

	@Override public RestWebServiceClient withHeaderAuth(HeaderAuthorization auth) {
		return null;
	}

	@Override public WebServiceResponse getIndex(String resource) throws IOException {
		return null;
	}

	@Override public WebServiceResponse getNew(String resource) {
		return null;
	}

	@Override public WebServiceResponse postCreate(String resource, JSONObject parameters) {
		return null;
	}

	@Override public WebServiceResponse getShow(String resource, long id) {
		return null;
	}

	@Override public WebServiceResponse getEdit(String resource, long id) {
		return null;
	}

	@Override public WebServiceResponse patchUpdate(String resource, JSONObject parameters,
													long id) {
		return null;
	}

	@Override public WebServiceResponse putUpdate(String resource, JSONObject parameters, long id) {
		return null;
	}

	@Override public WebServiceResponse deleteDestroy(String resource, long id) {
		return null;
	}


	@Override public void getIndexAsync(String resource, WebServiceResponseListener listener) {

	}

	@Override public void getNewAsync(String resource, WebServiceResponseListener listener) {

	}

	@Override public void postCreateAsync(String resource, JSONObject parameters,
										  WebServiceResponseListener listener) {

	}

	@Override public void getShowAsync(String resource, long id,
									   WebServiceResponseListener listener) {

	}

	@Override public void getEditAsync(String resource, long id,
									   WebServiceResponseListener listener) {

	}

	@Override public void patchUpdateAsync(String resource, JSONObject parameters, long id,
										   WebServiceResponseListener listener) {

	}

	@Override public void putUpdateAsync(String resource, JSONObject parameters, long id,
										 WebServiceResponseListener listener) {

	}

	@Override public void deleteDestroyAsync(String resource, long id,
											 WebServiceResponseListener listener) {

	}

	private class ConncetionAsyncTask extends AsyncTask<Void, Void, Void> {

		@Override protected Void doInBackground(Void... voids) {
			return null;
		}
	}
}
