package com.chw.test.dto;


public class StudentDTO {

    private Long studentId;

    private String studentName;

    public StudentDTO() {
    }

    public StudentDTO(Long studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void sayHello(){
        System.out.println("Hello,I am "+studentName+",nice to meet you!");
    }
}
