package anudip.mockito;

import java.util.List;

import org.junit.Test;

public class PeopleRepositoryStub implements PeopleRepository
{
	public List<Person> getAllPeople() 
	{
		Person p1=new Person("Vanisha","Nagesh",21);
		Person p2=new Person("Pavan","Nagesh",23);
		return List.of(p1,p2);
	}

	public List<Person> getByName(String name) 
	{
		return null;
	}
}
