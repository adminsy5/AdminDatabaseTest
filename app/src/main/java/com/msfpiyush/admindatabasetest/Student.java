package com.msfpiyush.admindatabasetest;

public class Student {
    String myRno,myName,myClass;

    public Student(String myRno, String myName, String myClass) {
        this.myRno = myRno;
        this.myName = myName;
        this.myClass = myClass;
    }

    public String getMyRno() {
        return myRno;
    }

    public String getMyName() {
        return myName;
    }

    public String getMyClass() {
        return myClass;
    }
}

