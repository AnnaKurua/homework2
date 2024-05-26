package lms;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String lastName;
    private String studentId;

    public Student(String name,String lastName, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }
    public String getLastName(){
        return lastName;
    }

    public String getStudentId() {
        return studentId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "lastName='" + lastName + '\'' +
                ", studentId='" + studentId + '\'' +
                '}'
                ;
    }
}