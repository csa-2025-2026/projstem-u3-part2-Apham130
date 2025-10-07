import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  
    
    //problem 1
    double target = 12.345;
    System.out.println("Enter a double:");
    double xx = scan.nextDouble();
    if (xx == target) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    //problem 2
    int target2 = 48;
    System.out.println("Enter an integer:");
    int x = scan.nextInt();
    if (x == target2) {
      System.out.println("YES");
    } 

    //problem 3
    System.out.println("Enter two integers:");
    x = scan.nextInt();
    int x2 = scan.nextInt();
    if (x * 2 == x2) {
      System.out.println("YES");
    }
    
    //problem 4
    System.out.println("Enter an integer:");
    x = scan.nextInt();
    if (x % 2 == 0) {
      System.out.println("Divisible by 2!");
    } 
    if (x % 3 == 0) {
      System.out.println("Divisible by 3!");
    }

    //problem 5
    System.out.println("Enter an integer:");
    x = scan.nextInt();
    if (x % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }

    //problem 6
    System.out.println("Enter a letter grade:");
    String str = scan.next();
    if (str.equals("A")) {
      System.out.println("90-100");
    } else if (str.equals("B")) {
      System.out.println("80-90");
    } else if (str.equals("C")) {
      System.out.println("70-80");
    } else if (str.equals("D")) {
      System.out.println("60-70");
    } else if (str.equals("F")) {
      System.out.println("0-60");
    } else {
      System.out.println("Invalid letter grade");
    }



    scan.close();
  }
}
