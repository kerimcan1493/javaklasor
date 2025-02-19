package Boxing_Match_Simulator;

import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            if (decideFirstAttacker()){
                System.out.print(f1.name+" Dövüşe Başlıyor..");
                fightSequence(f1,f2);
            }else {
                System.out.println(f2.name+" Dövüşe Başlıyor..");
                fightSequence(f2,f1);
            }

        } else {
            System.out.println("Sporcuların Sıkletleri Uyuşmuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight <= maxWeight && this.f1.weight >= minWeight) && (this.f2.weight <= maxWeight && this.f2.weight >= minWeight);
    }

    boolean isWin() {
        if (this.f1.health <= 0) {
            System.out.println(this.f2.name + " KAZANDI..");
            return true;
        }
        if (this.f2.health <= 0) {
            System.out.println(this.f1.name + " KAZANDI..");
            return true;
        }
        return false;
    }
    boolean decideFirstAttacker(){
        Random rand=new Random();
        return rand.nextBoolean();
    }
    void fightSequence(Fighter attacker,Fighter defender){
        while (this.f1.health > 0 && this.f2.health > 0) {
            defender.health =attacker.hit(defender);
            if (isWin()) {
                break;
            }
            attacker.health = defender.hit(attacker);
            if (isWin()) {
                break;
            }
            System.out.println(this.f1.name + " Sağlık : "+this.f1.health);
            System.out.println(this.f2.name + " Sağlık : "+this.f2.health);
        }
    }
}
