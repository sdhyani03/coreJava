package oops.objects;

public class BasicsRunner {


	public static void main(String[] args) {
		
		// Object is real time entity having state and behaviour. It has identity also but known to JVM internally. 
		//It can be physical or logical
		// We can create objects in multiple ways like using new operator, clone(), newInstance(), factory method , deserialization etc
		
		Student student1=new Student(); // new operator allocates memory for the object at runTime in heap.
		//reference variable 'student' is created in Stack
		
		System.out.println("student1 :"+student1);
		
		
		Student student2=new Student(2,"Sachin");
		System.out.println("student1 :"+student2);
	}

}
