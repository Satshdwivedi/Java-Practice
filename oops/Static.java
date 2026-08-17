 class Student4{
    String name;
    static String college="RGPV" ;
 }
 public class Static{
   public static void main(String[] args) {
      Student4 s1=new Student4();
      Student4 s2=new Student4();
      s1.name="Saurabh";
      s2.name="Vipin";
      System.out.println(s1.name+"- "+Student4.college);
      System.out.println(s2.name+" -"+Student4.college);
   }
 }