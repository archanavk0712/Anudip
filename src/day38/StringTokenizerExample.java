package day38;

import java.util.StringTokenizer;

public class StringTokenizerExample
{
	public static void main(String[] args) 
	{
		String s="Java#Python#SQL#Web";
	//	StringTokenizer st=new StringTokenizer(s,"#",false);
		StringTokenizer st=new StringTokenizer(s,"#",true);
		while(st.hasMoreTokens()==true)
		{
			System.out.println(st.nextToken());
		}
	}
}
