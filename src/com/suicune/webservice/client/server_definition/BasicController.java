package com.suicune.webservice.client.server_definition;

import org.apache.http.HttpResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lapuente on 15.09.14.
 */
public class BasicController implements Resource {
	public String mName;
	private List<Action> mActions;

	public BasicController(String name) {
		mName = name;
		mActions = new ArrayList<>();
	}

	public BasicController(String name, List<Action> actions) {
		mName = name;
		mActions = actions;
	}

	@Override public String getPath() {
		return null;
	}

	@Override public List<Action> getActions() {
		return mActions;
	}

	@Override public HttpResponse execute(Action action) throws IOException {
		return action.execute();
	}
}
