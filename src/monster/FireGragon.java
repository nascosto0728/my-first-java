public class FireGragon extends Monster{
    hp = 500;
    attact = 50;
    gold = 30;
    exp = 400;

    public void skill(){
        if(hp < 60){
            player.beAttact(10000);
            hasUsedSkill = true;
        }
    }
    public boolean die(){
        if(hp < 1){
            return true;
            player.gainExp(this.getExp());
            player.gainGold(this.getGold());
            gameOver = true;
        }else{       
            return false;
        }
    }
}
