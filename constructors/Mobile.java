public class Mobile{
	public String name;
	public int price;
	public float size;
	public short memory;
	public String[] shop;
	
	public Mobile(){
	}
	public Mobile(String name, int price, float size, short memory, String[] shop){
		this.name=name;
		this.price=price;
		this.size=size;
		this.memory=memory;
		System.out.println("moblie name:"+name);
		System.out.println("price is:"+price);
		System.out.println("mobile size is:"+size);
		System.out.println("memory is:"+memory);
		for(int i=0; i<shop.length; i++){
		System.out.println("shop name"+shop[i]);
	
	
	
	
	
	
	
	
	
	
		}
	}
}