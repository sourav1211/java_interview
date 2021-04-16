package Serialization_deserilzation;

import java.io.Serializable;

public class Student implements Serializable {
    private static final Long serialVersionUID=2326598652223L;
    private String name;
    private String address;
    private String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
