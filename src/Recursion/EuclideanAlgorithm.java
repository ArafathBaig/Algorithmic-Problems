package Recursion;

public class EuclideanAlgorithm {
  public static void main(String[] args) {

    System.out.println ( gcdIterative (12,22));
    System.out.println (gcdRecursive (12,22) );
  }

  public static int gcdIterative(int num1,int num2){
    while(num2!=0){
      int temp = num2;
      num2=num1%num2;
      num1=temp;
    }
    return num1;
  }

  public static int gcdRecursive(int num1,int num2){
    if(num2==0) return num1;

  return  gcdRecursive (num2,num1%num2);

  }
}
