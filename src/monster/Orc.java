public class Orc extends Monster{
    hp = 300;
    attact = 30;
    gold = 15;
    exp = 150;

    public void skill(){
        if(round % 3 = 0){
            player.beAttact(attact*3/2);
            hasAttacted = true;
            hasUsedSkill = true;
            hp = hp/2;
        }
    }
        
}
