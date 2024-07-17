public class PanShopRunner{
public static void main(String[] args){
PanShop panshop=new PanShop();
System.out.println("PanShop"+panshop);

String[] types={"sweetpan", "withoutsweet"};
PanShop panshops=new PanShop("om sai",15,(byte)2, types);
System.out.println(panshops);



}
}