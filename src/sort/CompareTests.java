package sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareTests {
    public static void main(String args[]){
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,25,2,33,100));
        System.out.println(integers);

        integers.sort(Comparator.naturalOrder());
        System.out.println(integers);
        
        integers.sort(Comparator.reverseOrder());
        System.out.println(integers);

        //custom comparators ===========================================
        //comparing by id:

        Product p1 = new Product(1, "prod B", "category 12", 13.4 );
        Product p2 = new Product(2, "prod C", "category 24", 13.4 );
        Product p3 = new Product(3, "prod A", "category 2", 13.4 );

        List<Product> prods = Arrays.asList(p3,p1,p2);
        System.out.println(prods);
        
        prods.sort(Comparator.naturalOrder());
        System.out.println(prods);
        
        prods.sort(Comparator.reverseOrder());
        System.out.println(prods);


        //by anonymous class:

        prods.sort(new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return product1.getProductName().compareTo(product2.getProductName());
            }
        });

        System.out.println(prods);
        
        
        
        //by class:
        prods.sort(new CompareProductByCategory());
        System.out.println(prods);
    }
}

class CompareProductByCategory implements Comparator<Product>{
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getCategoryName().compareTo(product2.getCategoryName());
    }
}


