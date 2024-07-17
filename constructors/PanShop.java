public class PanShop{
public String name;
public int price;
public byte many;
public String[] types;

public PanShop(){
}

public PanShop(String name, int price, byte many, String[] types){
this.name=name;
this.price=price;
this.many=many;
System.out.println("name:"+name);
System.out.println("price:"+price);
System.out.println("how many i want is:"+many);
for(int i=0; i<types.length; i++){
System.out.println("types"+types);

}

}




}