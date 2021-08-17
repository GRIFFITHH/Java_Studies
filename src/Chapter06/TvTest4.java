package Chapter06;

public class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
		for(int i =0;i<tvArr.length;i++) {
			tvArr[i] = new Tv(); // 배열에 객체를 저장하여 객체배열을 생성
			tvArr[i].channel = i+10;// TvTest에서 클래스를 만들었으므로 사용  Tv()객체의 channel에 i+10값을 저장
		}
		for(int i =0;i<tvArr.length;i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}
}
