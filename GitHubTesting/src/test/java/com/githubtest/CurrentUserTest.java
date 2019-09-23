package com.githubtest;

import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.Test;

import com.githubttest.pojo.User;

public class CurrentUserTest {

  
    @Test(priority = 1, groups = {"smoke"},
    threadPoolSize = 1, invocationCount = 1)
public void currentUserTest() throws Exception {
  
  System.out.println("test");
  GitHubApi api = new GitHubApi();
  
  User user = api.user();
  assertThat(user.getLogin()).isEqualTo("fail-mvd-bcn");
}
}
