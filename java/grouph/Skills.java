/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xl5344
 */
import java.util.ArrayList;
public class Skills extends selfEval{
   private ArrayList<Student> student;
   private int javaskill;
   private int coop;
   private int priority;
   Skills(ArrayList<Student> student,int javaskill,int coop,int priority){
       this.student=student;
       this.javaskill=javaskill;
       this.coop=coop;
       this.priority=priority;
    }
    public ArrayList<Student> getStudent(){
        return student;
    }
    public int getjavaskill(){
        return javaskill;
    }
    public int coop(){
        return coop;
    }
    public int priority(){
        return priority;
    }
}
