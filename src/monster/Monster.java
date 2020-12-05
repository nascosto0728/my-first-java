abstract class Monster{
    protect int hp;
    protect int attact;
    protect int exp;
    protect int gold;
    protect boolean hasAttacted = false;
    protect boolean hasUsedSkill = false;
    
        
    public void skill(){}
    public void beAttact(int damage){
        hp = hp-damage;
    }
    public void attact(){
        player.beAttact(attact);
        hasAttacted = true;
    }
    public void roundEnd(){
        hasAttacted = false;
        hasUsedSkill = false;
    }
    public int getExp(){
        return exp;
    }
    public void getGold(){
        return  gold;
    }
    public boolean die(){
        if(hp < 1){
            return true;
            player.gainExp(this.getExp());
            player.gainGold(this.getGold());
        }else{       
            return false;
        }
    }

}