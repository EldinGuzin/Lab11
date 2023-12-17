package Lab11.Lab11;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws StudentNotFoundException, IOException
    {
        
    	
    	StudentSystem studentSystem = new StudentSystem("students.csv");
    	
//    	studentSystem.printAll();
//   	System.out.println(studentSystem.getStudentById(10));
//    	System.out.println(studentSystem.getStudentById(103246));
//    	System.out.println(studentSystem.getStudentById(10));
//    	System.out.println(studentSystem.getHighestGPAStudent());
//    	System.out.println(studentSystem.getLongestNameStudent());
    	
    	for(String s : studentSystem.getFiveStudentNames()) {
    		System.out.println(s);
    	}
    }
}
