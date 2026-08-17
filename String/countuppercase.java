public class countuppercase{

    public static void main(String[] args) {
        String name= "Java iS Very EAsy";
        int count=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)>='A' && name.charAt(i)<='Z'){
                count++;
            }
        }
        System.out.println(count);
    }
}