package com.githubtest;

import org.testng.annotations.Test;


public class AuthenticationTest {
  @Test(priority = 1, groups = {"smoke"},
      threadPoolSize = 1, invocationCount = 1)
  public void authenticationTest() throws Exception {
    
    System.out.println("test");
    GitHubApi api = new GitHubApi();
    api.authenticate();
    
  }
}
