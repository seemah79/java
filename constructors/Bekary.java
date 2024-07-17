public class Bekary{
public String name;
public int price;
public byte rating;
public String[] item;

public Bekary(){
}

public Bekary(String name, int price, byte rating, String[] item){
this.name=name;
this.price=price;
this.rating=rating;
System.out.println("name is:"+name);
System.out.println("price is:"+price);
System.out.println("rate is:"+rating);

for(int i=0; i<item.length; i++){
System.out.println("items"+item);







}
}
}