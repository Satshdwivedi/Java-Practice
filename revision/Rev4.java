abstract class Employee{
    final String company="ABC Company";
    abstract void work();
}
interface Bonus{
    void bonus();
}
class Developer extends Employee implements Bonus{
    public void work(){
        System.out.println("Electrical work");
    }
    public void bonus(){
        System.out.println("Yeraly");
    }
}
public class Rev4{
  public static void main(String[] args) {
    Employee e1=new Developer();
    Developer d1=new Developer();
    e1.work();
    System.out.println(e1.company);
    d1.bonus();


  }
}