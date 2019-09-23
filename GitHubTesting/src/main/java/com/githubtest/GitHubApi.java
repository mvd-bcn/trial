package com.githubtest;

import java.util.Base64;
import java.util.List;

import com.githubttest.pojo.User;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class GitHubApi {

  String url = "https://api.github.com/";

  public void authenticate() throws Exception {
    APIHandler api = new APIHandler();

    JsonObject json = new JsonObject();
    json.addProperty("query", "query { viewer { login }");
    String result = api.requestPostWithBodyJSONData(url + "graphql", json.toString());

  }

  public void currentUser() throws Exception {
    APIHandler api = new APIHandler();
    String result = api.requestGet(url + "user");

  }

  public void user(String user) throws Exception {
    APIHandler api = new APIHandler();
    String result = api.requestGet("https://api.github.com/users/" + user);

  }

  public void graphql() throws Exception {
    APIHandler api = new APIHandler();
    String result = api.requestGet("https://api.github.com/graphql");


  }

  public void getFeeds() throws Exception {
    APIHandler api = new APIHandler();
    String result = api.requestGet("https://api.github.com/feeds");


  }

  public User user() throws Exception {
    APIHandler api = new APIHandler();
    String result = api.requestGet("https://api.github.com/user");
    User user = User.fromJson(result);
    return user;

  }

}
