public class Pickel{
   public static final double gst = 0.18;
   public static final byte gm = 100;
   
  public static void quantity(){
	  
  System.out.println("the pickel name is mango");
  } 
  public static void price(){
   int price = 250;
System.out.println("price is:"+price);
  }
  
   public static void getgst(int price){
    //float gst = 0.18f;
	 double totalprice =(Pickel.gst*price)+price;
 System.out.println("getgst price is:" + totalprice);
 
 public static void gm(){
	 //byte gm = 100;
	 System.out.println("gm of the pickel is");
	 
	 
 }

} 

}
