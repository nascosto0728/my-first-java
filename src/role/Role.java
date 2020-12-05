import java.io.*;
import java.util.*;  
abstract class Role{
    protect int level = 1;
    protect int hpLimit = 100;
    protect int mpLimit = 10;
    protect int hpGrows;
    protect int mpGrows = 5;
    protect int atkGrows;
    protect int hp = 100;
    protect int exp = 0;
    pretect int mp = 10;
    protect int attact;
    protect int gold = 0;
    protect int mpCost = 5;
    protect String career;
    protect String name;
    protect int freezetime;

    public Role(String a, String b, int c, int d, int e, int f, int g){
        career = a;
        name = b;
        level = c;
        exp = d;
        gold = e;
        hp = f;
        mp = g;
    }

    public static void readRole(){
        try{
            Scanner roleSave = new Scanner(new File("/src/save/role_save"));
            roleSave.useDelimiter("_");

            String a = roleSave.next;
            String b = roleSave.next;
            int c = roleSave.nextInt;
            int d = roleSave.nextInt;
            int e = roleSave.nextInt;
            int f = roleSave.nextInt;
            int g = roleSave.nextInt;
            
            if(a.equals("Warrior"){
                Warrior player = new Warrior(a,b,c,d,e,f,g);
            }else if(a.equals("Bowman"){
               Bowman player = new Bowman(a,b,c,d,e,f,g);
            }
        }catch (Exception e){
        throw e;
        }
    }
    public void save(){
        PrintWriter writer = new PrintWriter(new File("/src/save/role_save.txt"));

        writer.print(career);
        writer.print("_");
        writer.print(name);
        writer.print("_");
        writer.print(level);
        writer.print("_");
        writer.print(exp); 
        writer.print("_");
        writer.print(gold);
        writer.print("_");
        writer.print(hp);
        writer.print("_");
        writer.print(mp);
        writer.print("_");
        writer.close();
    }
    public void getFreeze(int a){
        freezeTime = a;
    }
    public int returnFreezeTime(){
        return freezeTime;
    }
    public void setName(String a){
        name = a;
    }
    public void skill(){};
    public void beAttact(int damage){
        hp = hp-damage;
    }
    public void attact(){
        monster.beAttact(attact);
    }
    public void beAttact(int damage){
        hp = hp-damage;
    }
    public void levelUp(){
        while(exp > level*100){
            exp = exp-level*100;
            hpLimit = hpLimit + hpGrows;
            mpLimit = mpLimit + mpGrows;
            attact = atkGrows;
        }
    }
    public void roundEnd(){
        this.levelUp();
        hp = hpLimit;
        mp = mpLimit;
    }
  
    public boolean die(){
        if(hp < 1){
            return true;
        }else{       
            return false;
        }
    }
}