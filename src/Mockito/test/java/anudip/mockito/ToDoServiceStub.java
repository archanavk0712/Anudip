package anudip.mockito;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService
{
	@Override
	public List<String> retrieveTodos(String user)
	{
		return Arrays.asList("Learn Spring", "Learn Hibernate", "Learn to dance");
	}
}
