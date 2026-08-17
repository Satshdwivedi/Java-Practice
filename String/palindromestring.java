public class palindromestring
{
    public static void main (String[]args)
    {
        String name="madam";
        String reverse="";
for(int i=name.length()-1;i>=0;i--){
     reverse=reverse+name.charAt(i);}
     if(name.equals(reverse)){
    
    System.out.print("String is Palindrome");}
    else 
    System.out.println("String is not Palindrome");


    }
}
