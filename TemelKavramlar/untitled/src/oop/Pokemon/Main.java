package oop.Pokemon;

public class Main {
    static void main(String[] args) {
    Pokemon pikachu = new Pokemon("Pikachu",14,4,40);
    Pokemon balbazaur = new Pokemon("Balbazar",19,3,45);

        Battle b1 = new Battle(pikachu,balbazaur);
        b1.startBattle();
    }

}
