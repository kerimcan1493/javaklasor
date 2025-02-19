package Boxing_Match_Simulator;

public class Fighter {
    String name;
    int damage;
    int weight;
    int health;
    int dodge;

    Fighter(String name, int health, int weight, int damage,int dodge) {
        this.name = name;
        this.health = health;
        this.weight = weight;
        this.damage = damage;
        this.dodge=dodge;
    }

    int hit(Fighter foe) {
        System.out.println("=============");
        System.out.println(this.name + " = > " + foe.name + " " + this.damage + " Hasar Vurdu.");
        if(isDodge()){
            System.out.println(foe.name+" gelen hasarı blokladı.");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean isDodge(){
        double randonValue=Math.random()*100;
        return randonValue<=this.dodge;
    }

}
