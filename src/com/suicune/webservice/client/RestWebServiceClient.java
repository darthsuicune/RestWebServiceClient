package com.suicune.webservice.client;

import com.suicune.webservice.client.auth.HeaderAuthorization;
import com.suicune.webservice.client.auth.PostAuthorization;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by lapuente on 09.09.14.
 */
public interface RestWebServiceClient {

	public HttpResponse getAuthToken(String username, String password);

	public HttpUriRequest addAuthTo(HttpUriRequest request, HeaderAuthorization auth);

	public HttpPost addAuthTo(HttpPost request, PostAuthorization auth);

	public RestWebServiceClient withPostAuth(PostAuthorization auth);

	public RestWebServiceClient withHeaderAuth(HeaderAuthorization auth);

	public WebServiceResponse getIndex(String resource) throws IOException;

	public WebServiceResponse getNew(String resource) throws IOException;

	public WebServiceResponse postCreate(String resource, JSONObject parameters) throws IOException;

	public WebServiceResponse getShow(String resource, long id) throws IOException;

	public WebServiceResponse getEdit(String resource, long id) throws IOException;

	public WebServiceResponse patchUpdate(String resource, JSONObject parameters, long id)
			throws IOException;

	public WebServiceResponse putUpdate(String resource, JSONObject parameters, long id)
			throws IOException;

	public WebServiceResponse deleteDestroy(String resource, long id) throws IOException;

	public void getIndexAsync(String resource, WebServiceResponseListener listener);

	public void getNewAsync(String resource, WebServiceResponseListener listener);

	public void postCreateAsync(String resource, JSONObject parameters,
								WebServiceResponseListener listener);

	public void getShowAsync(String resource, long id, WebServiceResponseListener listener);

	public void getEditAsync(String resource, long id, WebServiceResponseListener listener);

	public void patchUpdateAsync(String resource, JSONObject parameters, long id,
								 WebServiceResponseListener listener);

	public void putUpdateAsync(String resource, JSONObject parameters, long id,
							   WebServiceResponseListener listener);

	public void deleteDestroyAsync(String resource, long id, WebServiceResponseListener listener);
}
