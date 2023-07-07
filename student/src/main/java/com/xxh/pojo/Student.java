package com.xxh.pojo;


import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Student implements Serializable {

  private long sid;
  private String sno;
  private String sname;
  private String ssex;
  private java.sql.Date sbirth;
  private List<Course> courseList;
  private List<Sc> scList;

  public List<Sc> getScList() {
    return scList;
  }

  public void setScList(List<Sc> scList) {
    this.scList = scList;
  }

  public List<Course> getCourseList() {
    return courseList;
  }

  public void setCourseList(List<Course> courseList) {
    this.courseList = courseList;
  }

  public Student() {
  }

  @Override
  public String toString() {
    return "Student{" +
            "sid=" + sid +
            ", sno='" + sno + '\'' +
            ", sname='" + sname + '\'' +
            ", ssex='" + ssex + '\'' +
            ", sbirth=" + sbirth +
            ", courseList=" + courseList +
            ", scList=" + scList +
            '}';
  }

  public Student(long sid, String sno, String sname, String ssex, Date sbirth) {
    this.sid = sid;
    this.sno = sno;
    this.sname = sname;
    this.ssex = ssex;
    this.sbirth = sbirth;
  }

  public long getSid() {
    return sid;
  }

  public void setSid(long sid) {
    this.sid = sid;
  }


  public String getSno() {
    return sno;
  }

  public void setSno(String sno) {
    this.sno = sno;
  }


  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }


  public String getSsex() {
    return ssex;
  }

  public void setSsex(String ssex) {
    this.ssex = ssex;
  }


  public java.sql.Date getSbirth() {
    return sbirth;
  }

  public void setSbirth(java.sql.Date sbirth) {
    this.sbirth = sbirth;
  }

}
