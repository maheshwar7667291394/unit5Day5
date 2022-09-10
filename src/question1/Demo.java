package question1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Demo {
	
	public static void main(String[] args) {
		List<product> product=new ArrayList<>();
		product.add(new product(1, "shokes",100,4));
		product.add(new product(2, "sleepr",100,15));
		product.add(new product(3, "zins",400,12));
		product.add(new product(4, "watch",100,10));
		
		product.add(new product(5, "tshirt",200,12));	
		product.add(new product(6, "ring",100,4));
		product.add(new product(7, "gougls",100,12));
		
		
	   Collection<product> col=product.stream()
			   .filter(s->s.getQuantity()>10)
			   .collect(Collectors.toList());
	   
	   List<product> sorted=new ArrayList<>(col);
	   Collections.sort(sorted,(p1,p2)->p1.getPrice()>p2.getPrice() ? +1:-1);
	
	   
		System.out.println("without sorted order");	   
//	 for(product item:col) {
//		 System.out.println(item);
//	 }
		
		col.forEach(s->System.out.println(s));
	 
	 System.out.println();
	 System.out.println("after sorted");
	 
	 for(product item:sorted) {
		 System.out.println(item);
	 }

	}

}
