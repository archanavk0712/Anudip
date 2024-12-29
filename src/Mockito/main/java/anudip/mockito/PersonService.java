package anudip.mockito;

import java.util.List;
import java.util.stream.Collectors;

public class PersonService 
{
	private PeopleRepository peopleRepository;
	
	public PersonService(PeopleRepository peopleRepository)
	{
		this.peopleRepository = peopleRepository;
	}
	
	List<Person> getAdults()
	{
		return peopleRepository.getAllPeople()
		        .stream()
		        .filter(person -> person.getAge() >= 18)
		        .collect(Collectors.toList());
	}
	
	List<Person> findByName(String name)
	{
		return ((PeopleRepository) peopleRepository).getByName(name);
	}
	
}
