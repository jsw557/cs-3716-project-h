/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xl5344
 */
import java.util.ArrayList;
public class Course {
   private int courseNum;
   private String courseName;
   private ArrayList<Student> student;
    Course(int courseNum,String courseName,ArrayList<Student> student){
        this.courseNum=courseNum;
        this.courseName=courseName;
        this.student=student;
    }
    public int getcourseNum(){
        return this.courseNum;
    }
    public String getcourseName(){
        return this.courseName;
    }
    public ArrayList<Student> getStudent(){
        return this.student;
    }
}
