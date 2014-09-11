package com.suicune.webservice.client.test;

import com.suicune.webservice.client.BasicRestWebServiceClient;
import com.suicune.webservice.client.RestWebServiceClient;
import com.suicune.webservice.client.server_definition.BasicServerDefinition;
import com.suicune.webservice.client.server_definition.ServerDefinition;

import org.json.JSONObject;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class BasicRestWebServiceClientTest {
	RestWebServiceClient client;
	ServerDefinition definition;

	@org.junit.Before
	public void setUp() throws Exception {
		definition = new BasicServerDefinition("localhost", ServerDefinition.PROTOCOL_HTTP,
				ServerDefinition.DEFAULT_PORT_HTTP, null);
		client = new BasicRestWebServiceClient(definition);
	}

	@Test public void getIndex() {
		String resource = null;
		try {
			assertNotNull(client.getIndex(resource));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test public void getNew() {
		String resource = null;
		try {
			assertNotNull(client.getNew(resource));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test public void postCreate() {
		String resource = null;
		JSONObject parameters = null;
		try {
			assertNotNull(client.postCreate(resource, parameters));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test public void getShow() {
		String resource = null;
		long id = 0;
		try {
			assertNotNull(client.getShow(resource, id));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test public void getEdit() {
		String resource = null;
		long id = 0;
		try {
			assertNotNull(client.getEdit(resource, id));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test public void patchUpdate() {
		String resource = null;
		JSONObject parameters = null;
		long id = 0;
		try {
			assertNotNull(client.patchUpdate(resource, parameters, id));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test public void putUpdate() {
		String resource = null;
		JSONObject parameters = null;
		long id = 0;
		try {
			assertNotNull(client.putUpdate(resource, parameters, id));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test public void deleteDestroy() {
		String resource = null;
		long id = 0;
		try {
			assertNotNull(client.deleteDestroy(resource, id));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}