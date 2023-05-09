package stream_api;

public class Product {

	private int Id;
	private String Name;
	private float Price;
	
	
	public Product(int id, String name, float price) {
		super();
		Id = id;
		Name = name;
		Price = price;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", Name=" + Name + ", Price=" + Price + "]";
	}
	
	
}
