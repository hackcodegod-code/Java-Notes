import java.util.*;

public class TillMethods {
  int count = 0;
  public static void main(String[] args){

    Main obj = new Main();

    Scanner input = new Scanner(System.in);

    int temp = 100;


    System.out.print("Enter a number: ");
    int a1 = input.nextInt();

    System.out.print("Enter a number: ");
    int a2 = input.nextInt();

    int sum1 = obj.sum(a1,a2);
    int sum2 = obj.sum(a1,a2,temp);
    System.out.println("The sum of two numbers is "+sum1+" and three number is "+sum2);

    obj.checkEvenOrOdd(sum1,sum2);

    System.out.println(temp+" is local variable");
    System.out.println(obj.count+" is class variable");


    input.nextLine();



    input.close();
  }
  int sum(int a,int b){
    count += 1;
    return a+b;

  }
  int sum(int a, int b, int c){
    count += 1;
    return a+b+c;

  }

  void checkEvenOrOdd(int a, int b){
    count +=1;
    if(a%2 == 0){
      System.out.println(a+" is Even");
    }
    else{
      System.out.println(a+" is Odd");
    }
    if(b%2 == 0){
      System.out.println(b+" is Even");
    }
    else{
      System.out.println(b+" is Odd");
    }
  }
}