package oops.objects;


//Class is a blueprint of an object. It is a collections of similar objects. It will be logical always

/**
 * 
 * @author Sachin
 *
 */
public class Basics {

}

class Student
{
	int id; // Instance Variable. Memory is allocated at runtime only i.e. when instance is created and not compile time
	String name;
	
	Student(){
		
	}
	
	//Constructor initialization
	 Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	//Method initialization
	void insertRecord(int id,String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
