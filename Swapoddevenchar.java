import java.util.*;
public class Swapoddevenchar
{
	public static void main(String[] args) 
	{
	    Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        char ch[]=str.toCharArray();
        char a;
        for(int i=0;i<str.length();i++)
        {
             a=ch[i];
               ch[i]=ch[i+1];
               ch[i+1]=a;
               i=i+1;
        }
        for(int i=0;i<str.length();i++)
        {
            System.out.print(ch[i]);
        }
	}
}
