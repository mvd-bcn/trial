package com.githubtest;

import org.testng.annotations.Test;

public class GraphQLTest {

  
    
    @Test(priority = 1, groups = {"smoke"},
        threadPoolSize = 1, invocationCount = 1)
    public void graphQLTest() throws Exception {
      
      System.out.println("graphQLTest");
      GitHubApi api = new GitHubApi();
      api.authenticate();
      api.graphql();
      
      
    }
  
}
