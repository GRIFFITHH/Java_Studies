package Chapter05;

public class ArrayEx03 {
	public static void main(String[] args) {
		int[] Arr = new int [5];
		
		for(int i=0; i<Arr.length;i++)
			Arr[i]=i+1; //배열의 선언후 for를 이용한 값 저장
		
		System.out.println("[변경전]");
		System.out.println("Arr.length:"+Arr.length);
		for(int i=0;i<Arr.length;i++) 
			System.out.println("arr["+i+"]:"+Arr[i]);
		
		int[] tmp = new int[Arr.length*2];//step1 배열의 길이를 늘려준다.
		
		for(int i=0; i<Arr.length;i++) //새로 길어진 배열의 길이이다.
			tmp[i] =Arr[i]; //step2 늘린 배열에 Arr에 저장된 값을 복사하고
			Arr=tmp;//step3 참조변수 tmp의 값을 Arr에 저장하고 Arr과 tmp는 같은배열을 가리키게 된다.
		
			System.out.println("[변경후]");
			System.out.println("Arr.length:"+tmp.length);
			for(int i=0; i<Arr.length;i++)
				System.out.println("arr["+i+"]:"+Arr[i]); //이름만 다를 뿐 tmp,Arr 둘 다 같은배열을 가리킨다.
			System.out.println(Arr[4]);
			System.out.println(Arr[5]);
			System.out.println(tmp[5]); 
		
	}
}
