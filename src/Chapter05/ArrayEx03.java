package Chapter05;

public class ArrayEx03 {
	public static void main(String[] args) {
		int[] Arr = new int [5];
		
		for(int i=0; i<Arr.length;i++)
			Arr[i]=i+1; //�迭�� ������ for�� �̿��� �� ����
		
		System.out.println("[������]");
		System.out.println("Arr.length:"+Arr.length);
		for(int i=0;i<Arr.length;i++) 
			System.out.println("arr["+i+"]:"+Arr[i]);
		
		int[] tmp = new int[Arr.length*2];//step1 �迭�� ���̸� �÷��ش�.
		
		for(int i=0; i<Arr.length;i++) //���� ����� �迭�� �����̴�.
			tmp[i] =Arr[i]; //step2 �ø� �迭�� Arr�� ����� ���� �����ϰ�
			Arr=tmp;//step3 �������� tmp�� ���� Arr�� �����ϰ� Arr�� tmp�� �����迭�� ����Ű�� �ȴ�.
		
			System.out.println("[������]");
			System.out.println("Arr.length:"+tmp.length);
			for(int i=0; i<Arr.length;i++)
				System.out.println("arr["+i+"]:"+Arr[i]); //�̸��� �ٸ� �� tmp,Arr �� �� �����迭�� ����Ų��.
			System.out.println(Arr[4]);
			System.out.println(Arr[5]);
			System.out.println(tmp[5]); 
		
	}
}
