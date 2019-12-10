import java.util.Random;

public class Affe extends Tier {
    public String[] namen = {"Abebe","Bobo","Alile","Dumi","Jamelia"};


    public Affe(int alter){
        Random randInt = new Random();
        this.alter = alter;
        this.isHappy = true;
        this.luckyNumber = 6;
        this.name = namen[randInt.nextInt(namen.length)];
        this.laut="UAAUAUAA";
    }

    @Override
    public String performAction(){
        return (this.name+" trommelt auf der Brust");
    }
}
