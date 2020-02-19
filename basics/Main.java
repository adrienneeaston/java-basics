//Hello World

public class Main {
  public static void main(String[] args) {
    System.out.printIn("Hello world!");
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