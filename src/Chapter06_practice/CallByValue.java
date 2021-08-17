package Chapter06_practice;

public class CallByValue {

	  public static void main(String[] args) {
	    Person p = new Person("wonwoo");
	    System.out.println("p.name: " + p.name);
	    callByValue1(p);
	    System.out.println("p.name: " + p.name);
	  }

	  public static void callByValue1(Person p) {
	    p = new Person("kevin");
	  }

	  public static void callByValue2(Person p) {
	    p.name = "kevin";
	  }
	}

	class Person  {
	  String name;

	  public Person(String name) {
	    this.name = name;
	  }
	}