package stream_api;

import java.util.*;

public class StreamSorting {

	public static void main(String[] args) {
		List< Product > products = new ArrayList < Product > ();
		 products.add(new Product(1, "HP Laptop", 25000));
	     products.add(new Product(2, "Dell Laptop", 3000));
	     products.add(new Product(3, "Lenevo Laptop", 28000));
	     products.add(new Product(4, "Sony Laptop", 28000));
	     products.add(new Product(5, "Apple Laptop", 90000));

        Collections.sort(products, new Comparator< Product > () {
          
        	@Override
            public int compare(Product o1, Product o2) {
                return (int)(o1.getName().compareTo(o2.getName()));
            }
		
        });

        // using lambda expression
        // ascending order
        Collections.sort(products, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
        System.out.println("Ascending order => " + products);
        // descending order
        Collections.sort(products, (o1, o2) -> (o2.getName().compareTo(o1.getName())));
        System.out.println("Descending order => " + products);
        
        // using Comparator.comparing() method
        Collections.sort(products, Comparator.comparing(Product::getName));
        System.out.println("Sorted List=>"+products);
    }

}


