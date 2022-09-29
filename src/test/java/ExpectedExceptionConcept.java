import org.testng.annotations.Test;

public class ExpectedExceptionConcept 
{
	@Test(expectedExceptions=Throwable.class)
	//@Test(expectedExceptions={ArithmeticException.class,NullPointerException.class})
	public void loginTest()
	{
		System.out.println("login test starting");
		int i =9/0;
		System.out.println("login test ending");
	}

}
