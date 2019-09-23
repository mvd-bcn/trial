package com.githubtest;

import org.testng.annotations.Test;

public class GetFeedsTest {


  @Test(priority = 1, groups = {"smoke"}, threadPoolSize = 1, invocationCount = 1)
  public void getFeeds() throws Exception {

    System.out.println("test");
    GitHubApi api = new GitHubApi();

    api.getFeeds();
  }
}
