package com.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person
{
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
}
public class StreamApiDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,3,1,4,5,7,8,4,6);
		
	//	for(Integer i:numbers) System.out.println(i);
		
		//numbers.forEach(i->System.out.print(i+" "));
		//System.out.println();
		

		/*
		 * for(Integer i:numbers) { if(i%2==0) System.out.println(i); }
		 */
		//numbers.stream().filter(i->i%2==0).forEach(i->System.out.print(i+" "));
		
		//numbers.stream().filter(i->i%2==0).forEach(System.out::print);
		
	List<Person> persons = Arrays.asList(new Person("sam", 16),new Person("peter", 15),new Person("john", 21));
	
	persons.stream().filter(p->p.getAge()<18).forEach(System.out::println);
	System.out.println();
	List<Person> list1 = persons.stream().filter(p->p.getAge()<18).collect(Collectors.toList());
	System.out.println(list1);
	
	persons.stream().filter(p->p.getAge()<18).map(p->p.getName().toUpperCase()).forEach(p->System.out.println(p));
	
	// sort the list based on name
	
	// before java 8
	
	
	Collections.sort(numbers);
	System.out.println(numbers);

	
	/*
	 * Comparator c = new Comparator<Person>() {
	 * 
	 * @Override public int compare(Person p1, Person p2) {
	 * 
	 * return p1.getName().compareTo(p2.getName()); }
	 * 
	 * };
	 */
			
			Comparator<Person> c =(Person p1, Person p2)->
					{
					return p1.getName().compareTo(p2.getName());
				  };
				
				
	//Collections.sort(persons,c);
	//System.out.println(persons);
	
	
	persons.stream().sorted(c).forEach(p->System.out.println(p));
	
List<Person> sortedList = persons.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
System.out.println(sortedList);
	
	
	}

}








