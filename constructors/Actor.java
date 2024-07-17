public class Actor{
public String name;
public int salary;
public boolean act;
public String[] film;

public Actor(){
}
public Actor(String name, int salary, boolean act, String[] film){
this.name=name;
this.salary=salary;
this.act=act;
System.out.println("actor name:"+name);
System.out.println("salary is:"+salary);
System.out.println("his act is good :"+act);

for(int i=0; i<film.length; i++){
System.out.println("Films are:"+film);
}


}



}