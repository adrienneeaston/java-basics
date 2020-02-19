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

//Arrays
//Change the values in numbers so it will not raise an error.

public class Main {
  public static void main(String[] args) {
      int[] numbers = {10, 2, 3, 4, 5};
      int length = numbers[0];
      char[] chars = new char[length];
      chars[numbers.length + 4] = 'y';
      System.out.println("Done!");
  }
}

//Loops
//Loop through and print out all even numbers, each in a separate line, from the numbers list in the same order they are received. Don't print any numbers that come after 237 in the sequence.

public class Main {
  public static void main(String[] args) {
      int[] numbers = {
          951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544, 
      615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941, 
      386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345, 
      399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217, 
      815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717, 
      958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470, 
      743, 527};

      int i;
      for(i = 0; i < numbers.length; i++) {
          if(numbers[i] == 237) {
              break;
          }
          if(numbers[i] % 2 != 0) {
              continue;
          }
          System.out.println(numbers[i]);
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

//Objects
//Write a new method in Point called scale, that will make the point closer by half to (0,0). So for example, point (8, 4) after scale will be (4, 2).

class Point {
  private double x;
  private double y;
  
  public Point(double x, double y) {
      this.x = x;
      this.y = y;
  }
  
  public void print() {
      System.out.println("(" + x + "," + y + ")");
  }
  
  public void scale() {
      x = x / 2;
      y = y / 2;
  }
}

public class Main {
  public static void main(String[] args) {
      Point p = new Point(32, 32);
      for (int i = 0; i < 5; i++) {
          p.scale();
          p.print();
      }
  }
}