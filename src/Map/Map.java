import java.io.*;
import java.util.*;
public class Map{

    private String map[][] = new String[7][7];
    private int pInx;
    private int pIny;

    public void readMap(){
        try{
            Scanner mapCol = new Scanner(new File("/src/Map/map.txt"));
            for(int i = 0; mapCol.hasNextLine(); i++){
                Scanner mapRow = new Scanner(mapCol.nextLine());
                mapRow.useDelimiter("");
                for(int j = 0; mapRow.hasNextLine(); j++){
                    map[i][j] = mapRow.next();
                    if(!(map[i][j].equals("N") || map[i][j].equals("P") || map[i][j].equals("D") || map[i][j].equals("G") || map[i][j].equals("M") || map[i][j].equals("O")){
                        throw Exception e = new Exception;
                    }else if(map[i][j].equals("P")){
                        pInx = j;
                        pIny = i;
                    }
                }
             }
    
        }catch (Exception e){
        System.out.print("Please Set the map right!");
        throw e;
        }
    }
    public void readMapSave(){
        try{
            Scanner mapCol = new Scanner(new File("/src/save/map_save.txt"));
            for(int i = 0; mapCol.hasNextLine(); i++){
                Scanner mapRow = new Scanner(mapCol.nextLine());
                mapRow.useDelimiter("");
                for(int j = 0; mapRow.hasNextLine(); j++){
                    map[i][j] = mapRow.next();
                    if(map[i][j].equals("P")){
                        pInx = j;
                        pIny = i;
                    }
                }
             }
    
        }catch (Exception e){
        System.out.print("you haven't save the game progress");
        throw e;
        }
    }
    public String move(String wasd){
        switch(wasd){
            case "w":
                if(pIny = 0){
                    System.out.println("you can't go upward anymore!");
                    throw Exception e = new Exception;
                }
                return map[pIny-1][pInx];
                map[pIny][pInx] = "N";
                map[pIny-1][pInx] = "P";
                break;
            case "a":
                if(pInx = 0){
                    System.out.println("you can't go left anymore!");
                    throw Exception e = new Exception;
                }
                return map[pIny][pInx-1];
                map[pIny][pInx] = "N";
                map[pIny][pInx-1] = "P";
                break;
            case "s":
                if(pIny = 6){
                    System.out.println("you can't go down anymore!");
                    throw Exception e = new Exception;
                }
                return map[pIny+1][pInx];
                map[pIny][pInx] = "N";
                map[pIny+1][pInx] = "P";
                break;
            case "d":
                if(pInx = 6){
                    System.out.println("you can't go right anymore!");
                    throw Exception e = new Exception;
                }
                return map[pIny][pInx+1];
                map[pIny][pInx] = "N";
                map[pIny][pInx+1] = "P";
                break;

        }
    }
    
    public void saveMap(){
        for(int i = 0; i < 7; i++){
            for(int j = 0 ; j < 7; J++){
                PrintWriter writer = new PrintWriter(new File("/src/save/map_save.txt"));
                writer.print(map[i][j])
            }
            writer.println(" ");
        }
        writer.flush();
        writer.close();
    }
    
    public void showMap(){
        for(int i = 0; i < 7; i++){
            for(int j = 0; J < 7; j++){
                System.out.print(map[i][j])
            }
            System.out.prinln(" ")
        }
    }

}

