package snippet;
import java.util.Random;
public class Snippet {
	static int s1[]=new int[50];
	static int s2[]=new int[50];
	static Random random=new Random();
	private static short generateOperand(int a){
		short s;
		s=(short)random.nextInt(a);
		return s;
	}
	private static void jianyan1(int x,int q){
		for(int i=0;i<50;i++){
			if(x==s1[i]){
				x=random.nextInt(q);
				jianyan1(x,q);
				break;
			}
		}
	}
	private static void jianyan2(int x,int q){
		for(int i=0;i<50;i++){
			if(x==s1[i]){
				x=random.nextInt(q);
				jianyan2(x,q);
				break;
			}
		}
	}
	public static void main(String[]args){
		int m=0,n=0,ov=0;
		int v;int l;String s;
			for(int i=0;i<50;i++){
				n=generateOperand(101);
				m=generateOperand(101);
				l=generateOperand(2);
				jianyan1(m,101);
				jianyan2(n,101);
					do{
						
						n=generateOperand(101);
						m=generateOperand(101);
						if(l==1) 	{v=m+n; s="+";}//当L=1是执行加法运算
						else 
							{v=m-n; s="-";}
						
					}while(v>100||v<0);
				
				int x=i+1;
				if(x%5==0){
					System.out.println((i+1)+":"+m+s+n+"="+v+"\t");
				}
				else System.out.print((i+1)+":"+m+s+n+"="+v+"\t");//算式和输出结果
			}
	}

		
}