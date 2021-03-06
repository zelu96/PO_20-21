package pl.edu.uwm.po.RPG;

import java.util.ArrayList;
import java.util.HashMap;

public class Drop{
    public Drop(ArrayList<Items> rzeczy, ArrayList<Integer> szansa_na_drop) {
        this.rzeczy = rzeczy;
        this.szansa_na_drop = szansa_na_drop;
    }

    public HashMap<String,Double> show(){
        HashMap<String,Double> zestawienie =new HashMap<>();
        double max=0;
        for( int x: szansa_na_drop){
            max+=x;
        }
        for(int i=0;i<rzeczy.size();i++){
            zestawienie.put(rzeczy.get(i).getName(),(double)Math.round(((szansa_na_drop.get(i)/max)*10000))/10000);
        }
        return zestawienie;
    }

    public ArrayList<Items> getRzeczy() {
        return rzeczy;
    }

    public ArrayList<Integer> getSzansa_na_drop() {
        return szansa_na_drop;
    }

    private ArrayList<Items> rzeczy;
    private ArrayList<Integer> szansa_na_drop; 
}
