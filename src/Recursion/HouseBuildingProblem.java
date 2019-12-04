package Recursion;

public class HouseBuildingProblem {
  public static void main(String[] args) {

    headRecursion (4);
    tailRecursion (4);
  }


  public static void headRecursion(int height){
    if(height==0) return;

    headRecursion (height-1);
    System.out.println (height );
  }

  public static void tailRecursion(int height){
    if(height==0) return;

    System.out.println (height );
    tailRecursion (height-1);
  }
}
