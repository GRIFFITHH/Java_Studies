package Practice;

public class Roseddukbokki {
    public static void main(String[] args) {
        System.out.println("로제 떡볶이를 먹어야할까?");
        int num = (int) ((Math.random() * 10) + 1);
        if (num >= 6) {
            System.out.println("먹지마 이것아");
        } else {
            System.out.println("당장 시켜");
        }
    }
}
