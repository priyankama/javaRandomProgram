class Fac{
	public static void main(String args[]){
		int n,i,fac=1;
		n=(int)(Math.random()*10);
		System.out.println(n);
		for(i=1;i<=n;fac*=i,i++);
		System.out.println("The factorial of a no is: "+fac);
	}
}	