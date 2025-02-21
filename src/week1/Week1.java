/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1;

/**
 *
 * @author AHMAD
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] studentList =  new Student[3];
        studentList[0] = new Student();
        studentList[0].setName("Jibran");
        
        for(Student s: studentList){
            System.out.println(s.getName());
        }
        
    }
    
}
