public class Mermaid extends Monster{
    hp = 200;
    attact = 20;
    exp = 90;
    gold = 10;
 
    public void skill(){
        if(round % 3 = 0){
            player.getFreeze(2);
            hasUsedSkill = true;
        }
    }
    public void attact(){
        player.beAttact();
        hasAttacted = true;
        hp = hp + 20;
    }
}
 
       