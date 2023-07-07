package com.xxh.pojo;


public class Admin {

  private long uid;
  private String uname;
  private String upassword;


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public String getUpassword() {
    return upassword;
  }

  public void setUpassword(String upassword) {
    this.upassword = upassword;
  }

  public Admin() {
  }

  public Admin(long uid, String uname, String upassword) {
    this.uid = uid;
    this.uname = uname;
    this.upassword = upassword;
  }

  @Override
  public String toString() {
    return "Admin{" +
            "uid=" + uid +
            ", uname='" + uname + '\'' +
            ", upassword='" + upassword + '\'' +
            '}';
  }
}
