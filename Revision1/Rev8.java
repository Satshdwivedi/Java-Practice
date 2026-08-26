import java.util.List;
import java.util.Optional;
class Product{
int id;
String name;
int price;
String category;
public Product(int id,String name,int price,String category){
    this.id=id;
    this.name=name;
    this.price=price;
    this.category=category;
}
}
public class Rev8{
    public static void main(String[] args) {
     List<Product>pro=List.of(new Product(11,"Laptop",55000,"Electronics"),
                          new Product(12,"Mobile",25000,"Electronics"),
                          new Product(13,"Chair",5000,"Furniture"),
                          new Product(14,"TV",47000,"Electronics"),
                          new Product(15,"Table",8000,"Furniture"));

           pro.stream()
        .sorted((a,b)->b.price-a.price)
        .filter(n->n.price>30000 && n.category.equals("Electronics"))
        .map(n->n.name)
        .forEach(n->System.out.println(n));
Optional<Product>result=pro.stream()
           // .max((p1,p2)->p1.price-p2.price);
            .max((p1,p2)->Integer.compare(p1.price,p2.price));
            System.err.println(result.get().name);    
}
}