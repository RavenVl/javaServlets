import java.util.ArrayList;
import java.util.List;

/**
 * Created by raven on 13.08.2016.
 */
public class dbProduct {
    List<Product> products = new ArrayList<>();
    public void setProducts(){
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Name1");
        p1.setPrice(10);
        products.add(p1);

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Name2");
        p2.setPrice(20);
        products.add(p2);

        Product p3 = new Product();
        p1.setId(3);
        p1.setName("Name3");
        p1.setPrice(30);
        products.add(p3);



    }
    public Product getId(int id){
        return products.get(id);
}
}
