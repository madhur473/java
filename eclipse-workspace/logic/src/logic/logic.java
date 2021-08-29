package logic;


public class logic {
	public int factor(int n) {
		System.out.println("factor of given number are:");
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		return 0;
	}
	public int factorial(int n)
	{
		int ans=1;
		System.out.println("factorial of given number is:");
		for(int i=1;i<=n;i++)
		{
			ans=ans*i;
		}
		System.out.println(ans);
		return n;
	}
	public int fibbonaci (int n) 
	{
		{
		int cnt=0,k,i=1,j=1;
		System.out.println("fibbonaci series of given number is:");
		System.out.println(i);
		System.out.println(j);
		while(cnt<=n)
		{
			k=i+j;
			System.out.println(k);
			i=j;
			j=k;
			return n;
		}
		}
		return n;
	}
		
		public int power(int b,int p)
		{
			int ans=1;
			for(int i=1;i<=p;i++)
			{
				ans=ans*b;
			}
			System.out.println("for base"+b+"ans power"+p+"answer is"+ans);
			return ans;
		}
		public int prime(int n)
		{
			int i,flag=1;
			for(i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("number is prime...");
			}
			else
			{
				System.out.println("number is not prime");
			}
			return n;
		}
		public int amstrong(int n)
		{
			int sum=0,temp;
			temp=n;
			while(temp>0)
			{
				temp=temp%10;
				sum=sum+(n*n*n);
				n=n/10;
			}
			if(temp==sum)
			{
				System.out.println("number is amstrong");
			}
			else
			{
				System.out.println("number is not amstrong");
			}
			return n;
		}
	}

