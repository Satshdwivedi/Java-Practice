class Student {
    private String name;
    private int age;

    public void showdetail() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }

    public void setDetails(String name, int age) 
    {
        if(age>0){
        this.name = name;
        this.age = age;}
        else
        System.out.println("invalid age");
    }
    public String getname() {
    return name;
}
public int getAge() {
    return age;
}
}

public class encapsul {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setDetails("Ram",38);
        s2.setDetails("Shyam",0);

        
        s1.showdetail();
        s2.showdetail(); 
        System.out.println(s1.getname());
        System.out.println(s1.getAge());
    }
}