package day10;

import java.util.Objects;

public class EqualsMethod 
{
	int age;
	EqualsMethod(int age)
	{
		this.age=age;
	}
	public static void main(String[] args) 
	{
		EqualsMethod  e1=new EqualsMethod (12);
		EqualsMethod  e2=new EqualsMethod (12);
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}
	@Override
	public int hashCode() {
		return Objects.hash(age);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsMethod other = (EqualsMethod) obj;
		return age == other.age;
	}

}
