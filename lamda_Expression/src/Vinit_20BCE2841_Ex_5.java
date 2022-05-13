import java.util.*;
public class Vinit_20BCE2841_Ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2);
		System.out.println(3);
		Runnable t = ()->{for(int i=5;i<100;i++)
			{
			int c=0;
				for(int j=2;j<i/2;j++)
				{
					if(i%j==0)
					{
						c++;
						break;
					}
				}
				if(c==0)
				{
				
					System.out.println(i);
				}
			}
			};
		Thread thr1 = new Thread(t);
		thr1.start();
		
	}

}
