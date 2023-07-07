package com.xxh.pojo;


public class Sc {

  private long scid;
  private long sid;
  private long cid;
  private String degree;
  private Course course;

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public long getScid() {
    return scid;
  }

  public void setScid(long scid) {
    this.scid = scid;
  }


  public long getSid() {
    return sid;
  }

  public void setSid(long sid) {
    this.sid = sid;
  }


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public String getDegree() {
    return degree;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }

  public Sc() {
  }

  @Override
  public String toString() {
    return "Sc{" +
            "scid=" + scid +
            ", sid=" + sid +
            ", cid=" + cid +
            ", degree='" + degree + '\'' +
            ", course=" + course +
            '}';
  }

  public Sc(long scid, long sid, long cid, String degree) {
    this.scid = scid;
    this.sid = sid;
    this.cid = cid;
    this.degree = degree;
  }
}
