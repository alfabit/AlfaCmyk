
package com.digitwolf.cmyk.client;

import java.util.ArrayList;

import com.digitwolf.cmyk.client.models.Machine;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DataServiceAsync {

	void getMachines(AsyncCallback<ArrayList<Machine>> callback);

	void addMachine(Machine machine, AsyncCallback<Void> callback);

}
