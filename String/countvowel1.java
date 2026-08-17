public class countvowel1{
    public static void main (String[]args){
        String name="as soon as possible";
        int count=0;
for(int i=0;i<name.length();i++)
{
     if("aeiou".indexOf(name.charAt(i)) != -1)
       count++;
}
System.out.println("total vowel= "+count);
}
    }
