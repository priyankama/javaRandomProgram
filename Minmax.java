class Minmax{
	public static void main(String args[]){
		int max,min,a,b,c,d,tmax;
		a=(int)(Math.random()*100);
		b=(int)(Math.random()*100);
		c=(int)(Math.random()*100);
		d=(int)(Math.random()*100);
		System.out.println("a= "+a+" b= "+b+" c= "+c+" d= "+d);
		if(a>b){
			max=a;
			min=b;
			}
		else {
			max=b;
			min=a;
			}
		if(c>max){
			max=c;
			}
		if(c<min){
			min=c;
		}
		if(d>max){
			max=d;
			}
		if(d<min){
			min=d;
		}
		System.out.println("max no = "+max+" min no = "+min);		
	}
}