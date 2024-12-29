package anudip.mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ToDoBusinessImplStubTest 
{
	@Test
	public void usingAStub()
	{
		ToDoService todoService =new ToDoServiceStub();
		ToDoBusinessImpl todoBusinessImpl =new ToDoBusinessImpl(todoService);
		List <String> todos = todoBusinessImpl.retrieveToDoRelatedToSpring("River");
		assertEquals(1,todos.size());
	}
}
