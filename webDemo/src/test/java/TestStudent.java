package test.java;


import org.junit.Test;

import main.java.com.chinasofti.entity.Student;
/**
 * 这是一个通过JUIT的测试
 * @author Administrator
 *
 */
public class TestStudent {
	@Test
	public void testConstructor()
	{
		Student student = new Student(10, "小李", 18);
		System.out.println(student);
	}

}
