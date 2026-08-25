import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1 {
    String name;
    String department;
public  Employee1 (String name,String department){
        this.name=name;
        this.department=department;
  }
  @Override
  public String toString(){
    return name;
  }
}

public class GroupCount {
    public static void main(String[] args) {
       List<Employee1>emp=List.of(new Employee1("Ram","IT"),
                                  new Employee1("Shyam","HR"),
                                  new Employee1("Mohan","IT"),
                                  new Employee1("Sohan","HR"),
                                  new Employee1("Ravi","Sales"));
       Map<String,Long>result=emp.stream() 
                            .collect(Collectors.groupingBy(e->e.department,Collectors.counting()));
                            System.out.println(result);
    }
}
