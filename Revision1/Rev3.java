import java.util.List;
import java.util.Optional;
class Emp{
int id;
String name;
int salary;
public Emp(int id,String name,int salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
}
}
public class Rev3{
    public static void main(String[] args) {
     List<Emp>emp=List.of(new Emp(11,"Ram",32000),
                          new Emp(12,"Shyam",25000),
                          new Emp(13,"Mohan",35000),
                          new Emp(14,"Sohan",27000),
                          new Emp(15,"Ravi",23000));

      Optional<Emp>result=emp.stream()
        .sorted((a,b)->b.salary-a.salary)
        .filter(n->n.salary>30000)
        .findFirst();
        System.out.println(result.get().name);
}
}