package com.bogus.rest.webservices.restfulwebservices.helloWorld;

public class HelloWorldBean {

    private String meeting;

    public HelloWorldBean(String str) {
        this.meeting = str;
    }

    public String getMeeting() {
        return meeting;
    }

    public void setMeeting(String meeting) {
        this.meeting = meeting;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "meeting='" + meeting + '\'' +
                '}';
    }
}
