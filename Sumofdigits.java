class Sumofdigits{
	public static void main(String args[]){
		int sum=0,n,i,r;
		n=(int)(Math.random()*100000);
		System.out.println(n);
		while(n>0){
			r=n%10;
			sum=sum+r;
			n/=10;
			}System.out.println("The sum of digits = "+sum);
	}
}