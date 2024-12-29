package anudip.mockito;

import java.util.Collection;
import java.util.List;

public interface PeopleRepository 
{
	Collection<Person> getAllPeople();
	
	List<Person> getByName(String name);
}