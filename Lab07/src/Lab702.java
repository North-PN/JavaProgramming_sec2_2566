import java.util.*;
import java.text.*;
public class Lab702 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#.00");
		double score[]=new double[5];
		double mean = 0;
		for(int i=0 ; i<score.length;i++)
		{
			System.out.print("input score of student "+(i+1)+": ");
			score[i] = scan.nextDouble();
			mean += score[i];
		}
		mean/=score.length;
		System.out.println("\nAverage of "+score.length+" student is "+frm.format(mean));
		int num=1;
		for(double great :score)
		{			
			if(great>mean)
			{
				System.out.println("> Student "+num+" ("+great+")");
			}
			num++;
		}
	}

}
