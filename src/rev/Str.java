package rev;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="/name=\"ABC\"/company=\"uniq\"/exp=\"2 years\"";
		Scanner sc=new Scanner(System.in);
		String[] str=s.split("/");
		System.out.println("enter what you want");
		String w=sc.next();
		/*String name="",company="",exp="";
		for (String field : str) {
            if (field.contains("name=")) {
                name = field.split("=")[1].replace("\"", "");
            } else if (field.contains("company=")) {
                company = field.split("=")[1].replace("\"", "");
            } else if (field.contains("exp=")) {
                exp = field.split("=")[1].replace("\"", "");
            }
        }*/
		for(int i=0;i<str.length;i++)
		{
			if(str[i].contains(w))
			{
				String name=str[i];
				String[]q=name.split("=");
				System.out.println(q[1]);
			}
		}

		
		
		/*int a=sc.nextInt();
		if(a==1)
		{
			System.out.println("Name :"+name);
			
		}
		if(a==2)
			System.out.println("company :"+company);
		if(a==3)
			System.out.println("exp :"+exp);*/
		
		

	}

}
