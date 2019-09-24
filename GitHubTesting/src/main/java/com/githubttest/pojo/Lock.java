package com.githubttest.pojo;

import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lock {

  @SerializedName("locked")
  @Expose
  private Boolean locked;
  @SerializedName("active_lock_reason")
  @Expose
  private String activeLockReason;

  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public String getActiveLockReason() {
    return activeLockReason;
  }

  public void setActiveLockReason(String activeLockReason) {
    this.activeLockReason = activeLockReason;
  }
  public static Lock fromJson(String jsonString) {
    Gson gson = new Gson();
    return gson.fromJson(jsonString, Lock.class);
  }

  public String toJSON() {
    Gson gson = new GsonBuilder().create();
    return gson.toJson(this);

  }

  public static Lock createRandom() {
    Lock lock = new Lock();
    int random = new Random().nextInt(500);
    lock.setActiveLockReason("lock reason " + random);
    lock.setLocked(true);
    return lock;
  }
}
