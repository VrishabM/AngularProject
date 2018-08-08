package com;

import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JSONManager {
	public String getProductJSON(List<User> userList) {
		JsonArray userArray = new JsonArray();
		for (User user : userList) {
			JsonObject object = new JsonObject();
			object.addProperty("id", user.getId());
			object.addProperty("name", user.getName());
			object.addProperty("description", user.getDescription());
			object.addProperty("price", user.getPrice());
			object.addProperty("category", user.getCategory());
			
			userArray.add(object);
		}
		return userArray.toString();
	}

}
