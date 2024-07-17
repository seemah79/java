public class Pg{
public String name;
public int rent;
public long mNo;
public int[] rooms;

public Pg(){
}
public Pg(String name, int rent, long mNo, int[] rooms){
this.name=name;
this.rent=rent;
this.mNo=mNo;
System.out.println("Pg name:"+name);
System.out.println("Pg rent:"+rent);
System.out.println("mobile number is:"+mNo);
for(int i=0; i<rooms.length; i++){
System.out.println("rooms"+rooms);
}
}












}