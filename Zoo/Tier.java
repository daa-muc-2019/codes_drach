public class Tier {
    public String name;
    public int alter;
    public boolean isHappy;
    public String laut;
    public int luckyNumber;

    public Tier(String name, int alter){
        this.name = name;
        this.alter = alter;
        this.isHappy = true;
    }
    public Tier() {

    }
    public String getName(){
        return this.name;
    }
    public int getAlter(){
        return this.alter;
    }
    public String getLaut(){
        return this.laut;
    }
    public boolean getIsHappy(){
        return this.isHappy;
    }
    public String performAction(){
        return"nix";
    }

}
