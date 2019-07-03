class Series{
	public static void main(String args[]){
		int c=0,count=0,max=0,i,n;
		n=(int)(Math.random()*10);
		System.out.print(n);
		for(i=1;i<=9;i++)
		{
			
			 if(n>=max)
			{
				max=n;
				++c;
			}
			else
			{
				max=n;
				if(c>count)
					count=c;
				c=1;
					
			}
			n=(int)(Math.random()*10);
			System.out.print(" "+n);
		}
			if(c>=count)
				count=c;
	System.out.println(" count = "+count);
	}
}	