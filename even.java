class Even{
	public static void main(String args[]){
		int a,b,c,d;
		a=(int)(Math.random()*100);
		b=(int)(Math.random()*100);
		c=(int)(Math.random()*100);
		d=(int)(Math.random()*100);
		int count=0;
		System.out.println("a= "+a+" b= "+b+" c= "+c+" d= "+d);
		if(a%2==0)
			{
			++count;
			System.out.println(a+" is even");
			}
		if(b%2==0)
			{++count;
			System.out.println(b+" is even");}
		if(c%2==0)
			{++count;
			System.out.println(c+" is even");}
		if(d%2==0)
			{++count;
			System.out.println(d+" is even");}
		System.out.println("no of even= "+count);
	}	
}
		
