package Chapter04;

public class FlowEx19 {
	public static void main(String[] args) {
		for(int i=1;i<10;i++)
			for(int j=1;j<10;j++)
				for(int k=i;k<10;k++) 
					System.out.printf(""+i+j+k+",");
				
	}
}
