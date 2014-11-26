/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xl5344
 */
import java.util.ArrayList;


public class Pref extends selfEval{
    private ArrayList<Student> student;
    private ArrayList prepstu = new ArrayList();;
    
    Pref( ArrayList<Student> student ) {
         this.student = student;
         prepstu = new ArrayList<Student>();
    }
    
    public ArrayList addPref(ArrayList<Student> student) {
        prepstu.add(student);
        return prepstu;
    }
}
