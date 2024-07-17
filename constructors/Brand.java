public class Brand{
public String name;
public int year;
public boolean good;
public int[] rate;
public Brand(){
}

public Brand(String name, int year, boolean good, String[] rate){
this.name=name;
this.year=year;
this.good=good;
System.out.println("name"+name);
System.out.println("starting year at:"+year);
System.out.println("it's quality good:"+good);
for(int i=0; i<rate.length; i++){
System.out.println("rates are:"+rate);
}
}






}