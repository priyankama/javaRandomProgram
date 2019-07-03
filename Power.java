class Power{
	public static void main(String args[]){
		int i,a,b;
		a=(int)(Math.random()*10);
		b=(int)(Math.random()*10);
		i=a;
		System.out.print("a = " +a +" b = "+b);
		if(b==0){a=1;}
		else{	while(b>1)
		{
			a*=i;
			--b;
		}}
		System.out.println("a raised to power b = "+a);
	}
}