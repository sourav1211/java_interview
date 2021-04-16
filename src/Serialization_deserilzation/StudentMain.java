package Serialization_deserilzation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentMain {
    private static void writeByteStream(Student student) {
        String fileLocation="F:\\Sourav_world\\GitHub_projects\\java_interview\\src\\Serialization_deserilzation\\student.ser";
        try {
            FileOutputStream fileOut = new FileOutputStream(fileLocation);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
        }catch (Exception e){

        }
    }

    public static void main(String[] args) {
        Student student=new Student();
        student.setAddress("Dhaka");
        student.setName("SOURAV");
        student.setSubject("Science");

        writeByteStream(student);
    }


}
