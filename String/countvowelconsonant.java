public class countvowelconsonant{
    public static void main (String[]args){
        String name="as soon as possible";
        int vowel=0;
        int consonant=0;
for(int i=0;i<name.length();i++)
{ char ch=name.charAt(i);
  if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u'&& ch!=' ')
       consonant++;
       else if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u') 
       vowel++;}

System.out.println("total Consonat= "+consonant);

    System.out.println("total vowel= "+vowel);
}}


    