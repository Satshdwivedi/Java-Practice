import java.util.List;
import java.util.Optional;
class Employee{
    int code;
    String name;
    int salary;
    public Employee(int code,String name,int salary){
        this.code=code;
        this.name=name;
        this.salary=salary;
    }
}
public class MinStream{
    public static void main(String[] args) {
        List<Employee>employee=List.of(new Employee(101,"Ram",25000),
                                       new Employee(102,"Shyam", 30000),
                                        new Employee(103, "Mohan", 15000));
            Optional<Employee>result= employee.stream()
            .min((e1,e2)->e1.salary-e2.salary);
                System.out.println(result.get().name);        
                            
    
                                    }
}