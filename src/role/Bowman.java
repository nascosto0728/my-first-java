public class Bowman extends Role{
    attact = 50;
    atkGrows = 5;
    hpGrows = 10;
    career = "Bowman";
    
    public void skill(){
        monster.beAttact(2*attact);
        mp = mp - mpCost;
    }
}