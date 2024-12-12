package oops;

public class Exceptionpgm {
	public static void main(String[]args) {

      try
      {
    	  int c=5/0;
    	  System.out.println(c);
      }
      catch (Exception e)
      {
    	  System.out.println(e.getMessage());
     }
      System.out.println("Hello hi");
      try
      {
    	  String s=null;
    	  System.out.println(s.length());
      }
      catch (NullPointerException e1)
      {
    	  System.out.println("Error Message");
}
     
      }
}


