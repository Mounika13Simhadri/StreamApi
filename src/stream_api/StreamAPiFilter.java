package stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPiFilter {

	
	public static void main(String[] args) {
		
//	    List <Product> filteredProducts = getProducts().stream()
//	               .filter((product) -> product.getPrice() > 25000)
//	               .collect(Collectors.toList());
//	           filteredProducts.forEach(System.out::println);
	           
	           
	     getProducts().stream()
	              .filter((product) -> product.getPrice() > 25000)
	              .forEach(System.out::println);
//		List<Product> list=new ArrayList<Product>();
//		
//		for(Product product :getProducts()) {
//			if(product.getPrice()>25000) {
//				list.add(product);
//			}
//		}
//	
//		for(Product product:list) {
//			System.out.println(product);
//		}
	}

	private static List < Product > getProducts() {
        List < Product > productsList = new ArrayList < Product > ();
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 3000));
        productsList.add(new Product(3, "Lenevo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000));
        return productsList;
    }
}


