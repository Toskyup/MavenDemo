package test.java;


import org.junit.Test;

import main.java.com.chinasofti.entity.Student;

public class TestStudent {
	@Test
	public void testConstructor()
	{
		Student student = new Student(10, "Ğ¡Àî", 18);
		System.out.println(student);
	}

}
