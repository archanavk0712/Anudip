package anudip.mockito;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusinessImpl 
{
	private ToDoService todoService ;
	
	public ToDoBusinessImpl(ToDoService todoService)
	{
		this.todoService=todoService;
	}
	
	public List<String> retrieveToDoRelatedToSpring (String user)
	{
		List<String> filteredTodos=new ArrayList<String>();
		List<String> allTodos=todoService.retrieveTodos(user);
		
		for(String todo: allTodos)
		{
			if(todo.contains("Spring"))
			{
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}

