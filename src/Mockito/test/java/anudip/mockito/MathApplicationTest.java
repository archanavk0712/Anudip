package anudip.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest 
{
	private MathOperation mathApplication;
	
	@Mock
	private CalculatorService calcService;
	
	@Before
	public void setUp()
	{
		MockitoAnnotations.openMocks(this);
		mathApplication=new MathOperation();
		mathApplication.setCalculatorService(calcService);	
	}
	
	@Test
	public void testAdd()
	{
		System.out.println("Running Addition Test");
		when(calcService.add(20.0,10.0)).thenReturn(30.0);
		assertEquals(30.0,mathApplication.add(20.0,10.0),0);
		verify(calcService).add(20.0,10.0);
	}
	
	@Test
	public void testSubtract()
	{
		System.out.println("Running Subtraction Test");
		when(calcService.subtract(20.0,10.0)).thenReturn(10.0);
		assertEquals(10.0,mathApplication.subtract(20.0,10.0),0);
		verify(calcService).subtract(20.0,10.0);
	}
}

