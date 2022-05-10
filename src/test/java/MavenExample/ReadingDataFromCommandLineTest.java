package MavenExample;

import org.testng.annotations.Test;

public class ReadingDataFromCommandLineTest {
	@Test(groups="smoke")
	public void readingDataFromCommandLineTest()
	{
		System.out.println("Changes Done");
		String url = System.getProperty("url");
		String un = System.getProperty("username");
		String pwd = System.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	}
	@Test(groups="regression")
  public void regressionTest() {
	  System.out.println("This is Regression TestCase");
	
}
}
