class Box<T,P>{
T value;
P first;
public Box(T value,P first){
    this.value=value;
    this.first=first;
}
public void show(){
    System.out.println(value+" "+first);
}
}
public class Generic{
    public static void main(String[] args) {
      Box<Integer,String>b1=new Box<>(100,"Java Price");
      Box<Integer,String>b2=new Box<>(35,"Ram age");
          b1.show();
          b2.show();

    }
}