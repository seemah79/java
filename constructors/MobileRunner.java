public class MobileRunner{
public static void main(String[] args){
Mobile mobile=new Mobile();
System.out.println("Mobile"+mobile);

String[] shop={"poorvika", "samsung","sangeetha"};
Mobile mobile1=new Mobile("Samsung",15000, 6.2f,(short)25,shop);
System.out.println(mobile);



}


}