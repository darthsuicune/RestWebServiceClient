package com.suicune.webservice.client;

import android.os.AsyncTask;

import com.suicune.webservice.client.auth.HeaderAuthorization;
import com.suicune.webservice.client.auth.PostAuthorization;
import com.suicune.webservice.client.server_definition.Action;
import com.suicune.webservice.client.server_definition.Resource;
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

	@Override public WebServiceResponse run(Resource resource, Action action) throws IOException {
		return null;
	}

	@Override public WebServiceResponse runAsync(Resource resource, Action action,
												 WebServiceResponseListener listener) {
		return null;
	}

	public WebServiceResponse getIndex(Resource resource) throws IOException {
		return null;
	}

	public WebServiceResponse getNew(Resource resource) throws IOException {
		return null;
	}

	public WebServiceResponse postCreate(Resource resource, JSONObject parameters)
			throws IOException {
		return null;
	}

	public WebServiceResponse getShow(Resource resource, long id) throws IOException {
		return null;
	}

	public WebServiceResponse getEdit(Resource resource, long id) throws IOException {
		return null;
	}

	public WebServiceResponse patchUpdate(Resource resource, JSONObject parameters, long id)
			throws IOException {
		return null;
	}

	public WebServiceResponse putUpdate(Resource resource, JSONObject parameters, long id)
			throws IOException {
		return null;
	}

	public WebServiceResponse deleteDestroy(Resource resource, long id) throws IOException {
		return null;
	}


	public void getIndexAsync(Resource resource, WebServiceResponseListener listener) {

	}

	public void getNewAsync(Resource resource, WebServiceResponseListener listener) {

	}

	public void postCreateAsync(Resource resource, JSONObject parameters,
								WebServiceResponseListener listener) {

	}

	public void getShowAsync(Resource resource, long id, WebServiceResponseListener listener) {

	}

	public void getEditAsync(Resource resource, long id, WebServiceResponseListener listener) {

	}

	public void patchUpdateAsync(Resource resource, JSONObject parameters, long id,
								 WebServiceResponseListener listener) {

	}

	public void putUpdateAsync(Resource resource, JSONObject parameters, long id,
							   WebServiceResponseListener listener) {

	}

	public void deleteDestroyAsync(Resource resource, long id,
								   WebServiceResponseListener listener) {

	}

	private class ConncetionAsyncTask extends AsyncTask<Void, Void, Void> {

		@Override protected Void doInBackground(Void... voids) {
			return null;
		}
	}
}
