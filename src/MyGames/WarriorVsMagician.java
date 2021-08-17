package MyGames;
import java.util.Scanner;

interface Fightable {

    int attack();

    boolean guard();
}

class Warrior implements Fightable {
    int HP = 150;
    int guardProperty = 70;
    @Override
    public int attack() {
        return 10;
    }

    @Override
    public boolean guard() {

        int x = (int)(Math.random()*10)+1;

        if(x*10>guardProperty)
            return true;
        else
            return false;
    }

    public String toString(){
        return "Warrior";
    }
}

class Magician implements Fightable {
    int HP = 100;
    int guardProperty = 40;
    int x = (int) (Math.random() * 10) + 1;

    @Override
    public int attack() {
        int damage = 40;

        if(x*10>=85){
            damage+=5;
            this.guardProperty-=10;
            System.out.println("대마법사의 지혜 발동");
            System.out.println("공격력이 증가했다!");
            System.out.println("방어력이 하락했다!");
        }
        return damage;
    }

    @Override
    public boolean guard() {

        if (x * 10 > guardProperty)
            return true;
        else
            return false;
    }

    public String toString() {
        return "Magician";
    }
}




class Attack {
    Warrior warrior = new Warrior(); //player 1
    Magician magician = new Magician(); //plater 2
    int turn =0;

    public void attackBy(Fightable f) {

        if(f.toString().equals("Magician")){
            if(warrior.guard() && warrior.HP>0){
                turn++;
                System.out.println("턴수 :"+turn+" Warrior GUARD! 현재체력"+warrior.HP);
                return;
            }
            warrior.HP=warrior.HP - f.attack();
            turn++;
            if(warrior.HP<=0) {
                System.out.println("game over , Magician Win");
                //System.out.println("게임을 다시 시작해주세요");
                return;

            }
            System.out.println("턴수 :"+turn+" Magician이 Warrior를 공격");
            System.out.println("남은 체력"+warrior.HP);

        } else if (f.toString().equals("Warrior")){
            if(magician.guard()&&magician.HP>0){
                turn++;
                System.out.println("턴수 :"+turn+" Magician GUARD! 현재체력"+magician.HP);
                return;
            }
            magician.HP =magician.HP - f.attack();
            turn++;
            if(magician.HP<=0) {
                System.out.println("game over , Warrior Win");
                //System.out.println("게임을 다시 시작해주세요");
                return;
            }
            System.out.println("턴수 :"+turn+" Warrior가 Magician를 공격");
            System.out.println("남은 체력"+magician.HP);

        }

    }
}

class gameOver {
    Warrior warrior = new Warrior(); //player 1
    Magician magician = new Magician(); //plater 2
    boolean gameover(){
            if(warrior.HP<=0 || magician.HP<=0){
                return false;
            } else return true;

        }
}

public class WarriorVsMagician {
    public static void main(String[] args) {
        Magician magician = new Magician();
        Warrior warrior = new Warrior();
        Attack atk = new Attack();
        Scanner scanner = new Scanner(System.in);

        while (new gameOver().gameover()) {
            int player = scanner.nextInt();
            if (player == 1) {
                atk.attackBy(magician);
            } else if (player == 2) {
                atk.attackBy(warrior);
            }
        }
        System.out.println("게임이 종료되었습니다.");
        scanner.close();
    }
}