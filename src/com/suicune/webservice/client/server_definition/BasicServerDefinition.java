package com.suicune.webservice.client.server_definition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lapuente on 10.09.14.
 */
public class BasicServerDefinition implements ServerDefinition {
	String mUrl;
	String mProtocol;
	int mPort;
	List<String> mAvailableResources;

	/**
	 * Basic constructor, uses HTTP and port 80 as default
	 * @param url
	 */
	public BasicServerDefinition(String url) {
		mUrl = url;
		mProtocol = PROTOCOL_HTTP;
		mPort = DEFAULT_PORT_HTTP;
		mAvailableResources = new ArrayList<>();
	}

	public BasicServerDefinition(String url, String protocol, int port,
								 List<String> availableResources) {
		mUrl = url;
		mProtocol = protocol;
		mPort = port;
		if(availableResources != null) {
			mAvailableResources = availableResources;
		} else {
			mAvailableResources = new ArrayList<>();
		}

	}

	@Override public String getUrl() {
		return mUrl;
	}

	@Override public String getProtocol() {
		return mProtocol;
	}

	@Override public int getPort() {
		return mPort;
	}

	@Override public List<String> getResources() {
		return mAvailableResources;
	}

	@Override public String toString() { return mProtocol + "://" + mUrl + ":" + mPort + "/"; }

	@Override public List<String> addResource(String resource) {
		mAvailableResources.add(resource);
		return mAvailableResources;
	}
}
