package Chapter04;
//다시풀기
public class Practice04 {
	public static void main(String[] args) {
		int x=0,y=1,sum=0;
		
		for(int i=1;sum<100;y=-y,i++) {
// , 은 어떨때 써야하는거지?=>어떤 경우에는 초기화식이 둘 이상 있을 수 있고, 증감식 역시 둘 이상 있을 수 있다. 
//이런 경우에는 쉼표(,)로 구분해서 작성한다.
//[출처] String 자바초보 = "반복문:for문";|작성자 고윤차
			x=y*i;
			sum+=x;
//			if(sum>=100) {
//				break;
//			}
		}
	System.out.println(x+","+sum);
	}
}
