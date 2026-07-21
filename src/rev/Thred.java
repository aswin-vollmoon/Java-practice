package rev;
public class Thred extends Thread {
public synchronized Runnable  odd() 
{
	for(int i=0;i<100;i++)
	{
		if(i%2!=0)
			System.out.println(i);
	}
	return null;
}
public synchronized Runnable even() 
{
	for(int i=0;i<100;i++)
	{
		if(i%2==0)
			System.out.println(i);
	}
	return null;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thred n=new Thred();
		Thread t=new Thread(n.even());
		Thread t1=new Thread(n.odd());
		t.start();
		t1.start();

	}

} 