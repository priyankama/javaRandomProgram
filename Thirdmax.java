class Thirdmax{
	public static void main(String args[]){
		int max,min,smax=0,a,b,c,d,tmax=0;
		a=(int)(Math.random()*100);
		b=(int)(Math.random()*100);
		c=(int)(Math.random()*100);
		d=(int)(Math.random()*100);
		System.out.println("a= "+a+" b= "+b+" c= "+c+" d= "+d);
		if(a>b)
		{
			max=a;
			smax=b;
		}
		else{
			max=b;
			smax=a;
		}
		if(c>max){
			tmax=smax;
			smax=max;
			max=c;
		}
		else if(c>smax){
			tmax=smax;
			smax=c;
		}
		if(d>max){
			tmax=smax;
			smax=max;
			max=d;
		}
		else if(d>smax){
			tmax=smax;
			smax=d;
		}
		else if(d>tmax){
			tmax=d;
		}
		System.out.println("third max no = "+tmax);		
	}
}