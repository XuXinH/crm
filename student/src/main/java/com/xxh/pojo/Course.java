package com.xxh.pojo;


import java.util.List;

public class Course {

  private long cid;
  private String cno;
  private String cname;
  private List<Student> studentList;
  private List<Sc> scList;

  @Override
  public String toString() {
    return "Course{" +
            "cid=" + cid +
            ", cno='" + cno + '\'' +
            ", cname='" + cname + '\'' +
            ", studentList=" + studentList +
            ", scList=" + scList +
            '}';
  }

  public List<Sc> getScList() {
    return scList;
  }

  public void setScList(List<Sc> scList) {
    this.scList = scList;
  }

  public List<Student> getStudentList() {
    return studentList;
  }

  public void setStudentList(List<Student> studentList) {
    this.studentList = studentList;
  }

  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public String getCno() {
    return cno;
  }

  public void setCno(String cno) {
    this.cno = cno;
  }


  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }

  public Course() {
  }

  public Course(long cid, String cno, String cname) {
    this.cid = cid;
    this.cno = cno;
    this.cname = cname;
  }

}
