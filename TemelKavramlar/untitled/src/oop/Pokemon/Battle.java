package oop.Pokemon;

public class Battle {
    Pokemon p1;
    Pokemon p2;

    Battle(Pokemon p1,Pokemon p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    void startBattle(){
        while(p1.health > 0 && p2.health > 0){
            System.out.println("==== YENİ ROUND ====");
            int random = (int)(Math.random() * 2);
            if(random == 0){
                p1.attack(p2);
                if(isWin()){
                    break;
                }
                p2.attack(p1);
                if(isWin()){
                    break;
                }
            }else{
                p2.attack(p1);
                if(isWin()){
                    break;
                }
                p1.attack(p2);
                if(isWin()){
                    break;
                }
            }

        }
    }

    boolean isWin(){
        if(p1.health == 0){
            System.out.println(p2.name + " Kazandı");
            return true;
        }
        if(p2.health == 0){
            System.out.println(p1.name + " Kazandı");
            return true;
        }
        return false;
    }


}
