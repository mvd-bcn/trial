package com.githubttest.pojo;

import java.util.List;
import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Issue {

  @SerializedName("url")
  @Expose
  private String url;
  @SerializedName("repository_url")
  @Expose
  private String repositoryUrl;
  @SerializedName("labels_url")
  @Expose
  private String labelsUrl;
  @SerializedName("comments_url")
  @Expose
  private String commentsUrl;
  @SerializedName("events_url")
  @Expose
  private String eventsUrl;
  @SerializedName("html_url")
  @Expose
  private String htmlUrl;
  @SerializedName("id")
  @Expose
  private Integer id;
  @SerializedName("node_id")
  @Expose
  private String nodeId;
  @SerializedName("number")
  @Expose
  private Integer number;
  @SerializedName("title")
  @Expose
  private String title;
  @SerializedName("user")
  @Expose
  private User user;
  @SerializedName("labels")
  @Expose
  private List<Object> labels = null;
  @SerializedName("state")
  @Expose
  private String state;
  @SerializedName("locked")
  @Expose
  private Boolean locked;
  @SerializedName("assignee")
  @Expose
  private Object assignee;
  @SerializedName("assignees")
  @Expose
  private List<Object> assignees = null;
  @SerializedName("milestone")
  @Expose
  private Object milestone;
  @SerializedName("comments")
  @Expose
  private Integer comments;
  @SerializedName("created_at")
  @Expose
  private String createdAt;
  @SerializedName("updated_at")
  @Expose
  private String updatedAt;
  @SerializedName("closed_at")
  @Expose
  private Object closedAt;
  @SerializedName("author_association")
  @Expose
  private String authorAssociation;
  @SerializedName("body")
  @Expose
  private String body;
  @SerializedName("closed_by")
  @Expose
  private Object closedBy;

  public String getUrl() {
  return url;
  }

  public void setUrl(String url) {
  this.url = url;
  }

  public String getRepositoryUrl() {
  return repositoryUrl;
  }

  public void setRepositoryUrl(String repositoryUrl) {
  this.repositoryUrl = repositoryUrl;
  }

  public String getLabelsUrl() {
  return labelsUrl;
  }

  public void setLabelsUrl(String labelsUrl) {
  this.labelsUrl = labelsUrl;
  }

  public String getCommentsUrl() {
  return commentsUrl;
  }

  public void setCommentsUrl(String commentsUrl) {
  this.commentsUrl = commentsUrl;
  }

  public String getEventsUrl() {
  return eventsUrl;
  }

  public void setEventsUrl(String eventsUrl) {
  this.eventsUrl = eventsUrl;
  }

  public String getHtmlUrl() {
  return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
  this.htmlUrl = htmlUrl;
  }

  public Integer getId() {
  return id;
  }

  public void setId(Integer id) {
  this.id = id;
  }

  public String getNodeId() {
  return nodeId;
  }

  public void setNodeId(String nodeId) {
  this.nodeId = nodeId;
  }

  public Integer getNumber() {
  return number;
  }

  public void setNumber(Integer number) {
  this.number = number;
  }

  public String getTitle() {
  return title;
  }

  public void setTitle(String title) {
  this.title = title;
  }

  public User getUser() {
  return user;
  }

  public void setUser(User user) {
  this.user = user;
  }

  public List<Object> getLabels() {
  return labels;
  }

  public void setLabels(List<Object> labels) {
  this.labels = labels;
  }

  public String getState() {
  return state;
  }

  public void setState(String state) {
  this.state = state;
  }

  public Boolean getLocked() {
  return locked;
  }

  public void setLocked(Boolean locked) {
  this.locked = locked;
  }

  public Object getAssignee() {
  return assignee;
  }

  public void setAssignee(Object assignee) {
  this.assignee = assignee;
  }

  public List<Object> getAssignees() {
  return assignees;
  }

  public void setAssignees(List<Object> assignees) {
  this.assignees = assignees;
  }

  public Object getMilestone() {
  return milestone;
  }

  public void setMilestone(Object milestone) {
  this.milestone = milestone;
  }

  public Integer getComments() {
  return comments;
  }

  public void setComments(Integer comments) {
  this.comments = comments;
  }

  public String getCreatedAt() {
  return createdAt;
  }

  public void setCreatedAt(String createdAt) {
  this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
  return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
  this.updatedAt = updatedAt;
  }

  public Object getClosedAt() {
  return closedAt;
  }

  public void setClosedAt(Object closedAt) {
  this.closedAt = closedAt;
  }

  public String getAuthorAssociation() {
  return authorAssociation;
  }

  public void setAuthorAssociation(String authorAssociation) {
  this.authorAssociation = authorAssociation;
  }

  public String getBody() {
  return body;
  }

  public void setBody(String body) {
  this.body = body;
  }

  public Object getClosedBy() {
  return closedBy;
  }

  public void setClosedBy(Object closedBy) {
  this.closedBy = closedBy;
  }


  public static Issue fromJson(String jsonString) {
    Gson gson = new Gson();
    return gson.fromJson(jsonString, Issue.class);
  }

  public String toJSON() {
    Gson gson = new GsonBuilder().create();
    return gson.toJson(this);

  }

  public static Issue createRandom() {
    Issue issue = new Issue();
    int random = new Random().nextInt(500);
    issue.setTitle("title issue " + random);
    issue.setBody("body " + random);
    return issue;
  }

}

