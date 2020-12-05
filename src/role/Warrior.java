public class Warrior extends Role{
    attact = 70;
    atkGrows = 10;
    hpGrows = 20;
    career = "Warrior";
    
    public void skill(){
        monster.beAttact(attact/2);
        hp = hp + attact/4;
        mp = mp - mpCost;
    }
}