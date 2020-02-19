//Hello World
//Print "Hello, World!" to the console.

public class Main {
  public static void main(String[] args) {
    System.out.printIn("Hello world!");
  }
}

//Variable and types
//Create all of the primitives (except long and double) with different values. Concatenate them into a string and print it to the screen so it will print: H3110 w0r1d 2.0 true

public class Main {
  public static void main(String[] args) {
      byte zero = 0;
      short three = 31;
      int one = 10;
      float two = 2.0f;
      char w = 'w';
      boolean b = true;
      String output = "H" + three + one + " " + w + zero + "r1d " + two + " " + b;
      System.out.println(output);
  }
}

//Conditionals
//Change the variables in the first section, so that each if statement resolves as true.

public class Main {
  public static void main(String[] args) {
      String a = new String("Wow");
      String c = "Wow!";
      String b = a;
      String d = c;

      boolean b1 = a == b;
      boolean b2 = d.equals(b + "!");
      boolean b3 = !c.equals(a);

      if (b1 && b2 && b3) {
          System.out.println("Success!");
      }
  }
}

//Functions
//Write the method printFullName of student which prints the full name of a student.

class Student {
  private String firstName;
  private String lastName;
  public Student(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
  }
  // Your code goes here
  public void printFullName() {
      System.out.println(firstName + " " + lastName);
  }
}

public class Main {
  public static void main(String[] args) {
      Student[] students = new Student[] {
          new Student("Morgan", "Freeman"),
          new Student("Brad", "Pitt"),
          new Student("Kevin", "Spacey"),
      };
      for (Student s : students) {
          s.printFullName();
      }
  }
}