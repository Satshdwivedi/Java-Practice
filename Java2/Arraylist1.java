import java.util.ArrayList;
public class Arraylist1{
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.set(1,200);
        nums.remove(0);
        System.out.println("nums= "+nums);
        System.out.println(nums.get(0));
    }
}