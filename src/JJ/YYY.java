package JJ;

public class YYY {
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int m=0,n=0,ov=0,q=0;
		char o='+';
		for(int i=0;i<200;i++) {
			ov=(int)(Math.random()*2);
			m=(int)(Math.random()*101);
			n=(int)(Math.random()*101);
			if(ov==1) {
				o='+';{
					if(m+n>100)
						continue;
				}
			}else {
				o='-';{
					if(m-n<0)
						continue;
				}
			}
			q++;
			if(q>50)
				continue;
			if((q-1)%5==0)
				System.out.println();
			System.out.print(""+q+":\t"+m+o+n+"=");
			result(m,n,ov);
		}
	}
	
	
	public static void result(int m,int n,int ov) {
		int y;
		if(ov==1) {
			y=m+n;
		}
		else {
			y=m-n;
		}
		System.out.print(y);
		System.out.print("  ");
	}
	
}
	
