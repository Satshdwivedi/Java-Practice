import java.util.List;
public class Flatmap{
    public static void main(String[] args) {
        List<List<String>>emp=List.of(List.of("Ram","Shyam"),List.of("Mohan","Sohan"),List.of("Ravi","Javi"));
        emp.stream()
        .flatMap(list->list.stream())
        .forEach(n->System.out.print(n+" "));
    }
}