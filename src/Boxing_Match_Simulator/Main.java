package Boxing_Match_Simulator;

public class Main {
    public static void main(String[] args) {
        Fighter f1 =new Fighter("Kerim Can",100,86,9,50);
        Fighter f2=new Fighter("Mustafa",100,83,8,60);

        Match match = new Match(f1,f2,50,100);
        match.run();


    }
}
