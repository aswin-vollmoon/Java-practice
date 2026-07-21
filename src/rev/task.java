package rev;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabbcc";
		String res="";
		int count=1;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
			{
				count++;
			}
			else
			{
				res+=s.charAt(i-1)+s.valueOf(count);
				count=1;
			}
			
		}
		res+=s.charAt(s.length()-1)+s.valueOf(count);
		System.out.println(res);
	}

}
