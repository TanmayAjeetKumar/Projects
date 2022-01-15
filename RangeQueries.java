import java.util.*;
public class RangeQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int L,R;
		Scanner sc=new Scanner(System.in);
		L=sc.nextInt();
		R=sc.nextInt();
		int i,sum=0;
		for(i=L;i<=R;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
