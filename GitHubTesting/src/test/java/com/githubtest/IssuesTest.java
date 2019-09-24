package com.githubtest;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import com.githubttest.pojo.Issue;
import com.githubttest.pojo.Lock;

public class IssuesTest {

  @Test(priority = 1, groups = {"smoke"}, threadPoolSize = 1, invocationCount = 1)
  public void createLockUnlockIssue() throws Exception {

    GitHubApi api = new GitHubApi();
    Issue randomIssue = Issue.createRandom();

    Issue issue = api.createIssue(randomIssue);
    assertThat(issue.getTitle()).isEqualTo(randomIssue.getTitle());

    api.lockIssue(issue, Lock.createRandom());

    api.deleteLockIssue(issue);

  }
}
