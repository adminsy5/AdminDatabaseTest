package com.msfpiyush.admindatabasetest;

public class Model
{
    String myRno,myName,myClass;

    Model()
    {

    }
    public Model(String myRno, String myName, String myClass) {
        this.myRno = myRno;
        this.myName = myName;
        this.myClass = myClass;
    }

    public String getMyRno() {
        return myRno;
    }

    public void setMyRno(String myRno) {
        this.myRno = myRno;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyClass() {
        return myClass;
    }

    public void setMyClass(String myClass) {
        this.myClass = myClass;
    }
}
