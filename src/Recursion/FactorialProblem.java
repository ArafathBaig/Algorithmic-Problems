package Recursion;

public class FactorialProblem {
  public static void main(String[] args) {
    System.out.println (factorial (1,5) );
  }

  public static int factorial(int accumulator,int n){
  if(n==1) return accumulator;

  return factorial (accumulator*n,n-1);
}
}
