public class Purse{
	public static final double discount = 0.10;
  public static void inside(){
   System.out.println("inside the purse amount is 2000");
   }
  public static void Rate(){
  int Rate = 300;
  System.out.println("the rate of the purse is:"+Rate);
  }
  public static void Zips(){
	  System.out.println("No. of zips in the purse is 5");
  }
	  public static void amount(int Rate){
     double amount= Rate-(Rate*Purse.discount);
      System.out.println("the discount of the purse is:"+amount);
  }
  }