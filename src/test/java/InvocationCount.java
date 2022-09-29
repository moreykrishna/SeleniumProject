import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test(invocationCount=10)
	public void createUser()
	{
		System.out.println("create user");
	}

}
