
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntroduction {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before ...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After...");
	}

	@Test
	public void test1() {
		System.out.println("Test1...");
	
	}
	
	@Test
	public void test2() {
		System.out.println("Test2...");
	
	}

}
