package Chapter05;

public class ArrayEx12 {
	public static void main(String[] args) {
		String[] names = {"Kim","Park","Yi"};
		
		for(int i=0;i<names.length;i++)
			System.out.println("names["+i+"]:"+names[i]);
		
		String tmp = names[2];
		names[0]=names[2];
		
		for(String str : names)
		System.out.println(str);
	}
}
