package app.pack.model;

public class Product {

	int id;
	String name;
	int minQua;
	int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMinQua() {
		return minQua;
	}
	public void setMinQua(int minQua) {
		this.minQua = minQua;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", minQua=" + minQua + ", price=" + price + "]";
	}
	
}


