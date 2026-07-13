package oop.Pokemon;

public class Pokemon {
    String name;
    int health;
    int damage;
    int defence;

    Pokemon(String name,int health,int damage,int defence){
        this.name = name;
        this.health = health;
        this.damage = damage;
        if(defence >= 0 && defence <= 100){
            this.defence = defence;
        }else{
            this.defence = 0;
        }
    }
    void attack(Pokemon enemy){
        System.out.println(this.name + " Saldırıyor !");
        int realDamage =  (this.damage - ((this.damage * enemy.defence) / 100));
        if(enemy.health - realDamage < 0){
         enemy.health = 0;
        }else{
        enemy.health -= realDamage;
        }
        System.out.println(enemy.name + " " + realDamage + " Hasar aldı.");
        System.out.println(enemy.name + " Canı: " + enemy.health );
    }
}
