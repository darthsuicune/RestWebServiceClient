package com.suicune.webservice.client.server_definition;

/**
 * Created by lapuente on 09.09.14.
 */
public interface ServerDefinition {
	public static final String PROTOCOL_HTTP = "http";
	public static final String PROTOCOL_HTTPS = "https";
	public static final int DEFAULT_PORT_HTTP = 80;
	public static final int DEFAULT_PORT_HTTPS = 443;
	public String getUrl();
	public String getProtocol();
	public String getPort();
}
