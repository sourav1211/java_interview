package Serialization_deserilzation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentByteToObject {
    private static void getObjectFromByteStream() {
        String fileLocation="F:\\Sourav_world\\GitHub_projects\\java_interview\\src\\Serialization_deserilzation\\student.ser";
        try {
            FileInputStream fileIn = new FileInputStream(fileLocation);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student studentDeserializedObject= (Student) in.readObject();
            System.out.println("Name : "+studentDeserializedObject.getName());
            System.out.println("Address : "+studentDeserializedObject.getAddress());
            System.out.println("Subject : "+studentDeserializedObject.getSubject());
        }catch (Exception e){

        }
    }
    public static void main(String[] args) {
        getObjectFromByteStream();
    }
}
