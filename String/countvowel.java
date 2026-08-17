public class countvowel{
    public static void main (String[]args){
        String name="as soon as possible";
        int count=0;
for(int i=0;i<name.length();i++)
{
     if(name.charAt(i)=='a'||
     name.charAt(i)=='e'||
     name.charAt(i)=='i'||
     name.charAt(i)=='o'||
     name.charAt(i)=='u')
       count++;
}
System.out.println("total vowel= "+count);
}
    }

    