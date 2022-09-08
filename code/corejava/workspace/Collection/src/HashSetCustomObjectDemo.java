import java.util.HashSet;
public class HashSetCustomObjectDemo {
	public static void main(String[] args) {
		Product p1 = new Product(11,"Abc", 4564.3);
		Product p2 = new Product(16,"Xyz", 6567.23);
		Product p3 = new Product(11,"ABC", 456.3);
		Product p4 = new Product(43,"Pqr", 7454.3);
		
		HashSet set = new HashSet();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set);
	}
}

class Product extends Object {
	private int id;
	private String name;
	private double price;
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "id:"+id + " Name:"+name;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Product p = (Product) obj;
		return id == p.id;
	}
		
	/*
	@Override
	public boolean equals(Object obj) {
		Product p = (Product) obj;
		return name.equalsIgnoreCase(p.name);
	}
	*/
	
	/*
	@Override
	public boolean equals(Object obj) {
		Product p = (Product) obj;
		return 
				(id == p.id) &&
				(name.equalsIgnoreCase(p.name)) &&
				(price == p.price);
	}
	*/
}