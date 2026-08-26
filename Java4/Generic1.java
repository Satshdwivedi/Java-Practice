class Box<T extends Number,P extends Object>{
    // yahan per p extends object ki jagah sirf p bhi likh skate hai kyoki object ke under string aur number dono aate hai
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
public class Generic1{
    public static void main(String[] args) {
      Box<Integer,String>b1=new Box<>(100,"Java Price");
      Box<Integer,Double>b2=new Box<>(35,39.7);
          b1.show();
          b2.show();

    }
}