package Lab11.Lab11;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class testlab {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		StudentSystem studentSystem = new StudentSystem("students.csv");
	}


	
	
	@After
	public void tearDown() throws Exception {
	}


	
	
	@Test
	public void testifStudentisPresent() throws StudentNotFoundException, IOException {
		
		StudentSystem studentSystem = new StudentSystem("students.csv");
		List<Student> listOfStudents = studentSystem.getStudents();
		boolean truth = false;
		
		if(listOfStudents.size() != 0) {
			truth = true;
		}
		assertEquals(true, truth);
		
	}
	
	
	@Test
	
	public void testHighestGPAStudent() throws StudentNotFoundException, IOException {
		StudentSystem studentSystem = new StudentSystem("students.csv");
		
		Student highest = studentSystem.getHighestGPAStudent();
		
		assertEquals("Mia Thomas", highest.toString());
	}
	 
	
	@Test
	public void testExceptionForEmptySongList() throws StudentNotFoundException, IOException {
		StudentSystem studentSystem = new StudentSystem("students.csv");
		
		assertFalse(studentSystem.students.isEmpty());
		
	}
	
	
	
	
	@Test
	public void testSize() throws StudentNotFoundException, IOException {

		StudentSystem studentSystem = new StudentSystem("students.csv");
		List<Student> listOfStudents = studentSystem.getStudents();
		int lenghtOfStudents = listOfStudents.size();
		assertEquals(70, lenghtOfStudents);
		
	}
	
	
	@Test
    public void testNamesArray() throws StudentNotFoundException, IOException {
        StudentSystem studentSystem = new StudentSystem("students.csv");

        String[] correctNames = {"Camila Wood",
                "Alexander Thompson",
                "Liam Taylor",
                "Evelyn Jenkins",
                "Michael Jackson"};

        String[] actualNames = studentSystem.getFiveStudentNames();

        // Ensure that the arrays are equal
        assertArrayEquals("Arrays should match", correctNames, actualNames);
    }
	
	
	@Test
	public void testLargestName() throws StudentNotFoundException, IOException {
		
		StudentSystem studentSystem = new StudentSystem("students.csv");
		
		assertNotEquals("Ava White",studentSystem.getLongestNameStudent());
	}
	
	@Test
	public void testStudents() throws StudentNotFoundException, IOException {
		
		StudentSystem studentSystem = new StudentSystem("students.csv");
		
		assertNotEquals(studentSystem.getLongestNameStudent(),studentSystem.getHighestGPAStudent());
		
	}
	
	
	@Test
	public void testSameStudent() throws StudentNotFoundException, IOException {
		
		StudentSystem studentSystem = new StudentSystem("students.csv");
		
		assertEquals(studentSystem.getStudentByIdNotOptional(12), studentSystem.getHighestGPAStudent());
	}
	
	
	

}
