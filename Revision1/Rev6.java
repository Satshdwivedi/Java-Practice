import java.util.List;
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
public class Rev6{
    public static void main(String[] args) {
     List<Emp>emp=List.of(new Emp(11,"Ram",32000),
                          new Emp(12,"Shyam",25000),
                          new Emp(13,"Mohan",35000),
                          new Emp(14,"Sohan",27000),
                          new Emp(15,"Ravi",33000));

           emp.stream()
          .filter(n->n.salary>30000)
        .map(n->n.name.toUpperCase()) 
        .forEach(n->System.out.println(n));       
      /* *int sum=0;
        for(Emp e:emp){
            if(e.salary>30000){
        sum=sum+ e.salary;
       }}
       System.out.println(sum); */
     int sum= emp.stream() 
        .filter(n->n.salary>30000)
        .map(n->n.salary)
        .reduce(0,(a,b)->(a+b));
     System.out.println(sum);
       
}
}