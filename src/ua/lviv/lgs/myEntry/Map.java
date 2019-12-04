package ua.lviv.lgs.myEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map<K, V> {

	private List <MyEntry<K, V>> list = new ArrayList<>();
	
	public void addElement(MyEntry<K, V> myEntry){
		list.add(myEntry);
    }
	
	public void removeKey(K ob1){
        for(MyEntry myEntry : list){
            if(myEntry.getOb1().equals(ob1)){
            	list.remove(myEntry);
                break;
            }
        }
    }
	
	public void removeValue(V ob2){
        for(MyEntry myEntry : list){
            if(myEntry.getOb2().equals(ob2)){
            	list.remove(myEntry);
            	break;
            }
        }
    }
	
	public void showKeys(){
        for(MyEntry myEntry : list){
            System.out.println(myEntry.getOb1());
        }
    }
	
	public void showValue(){
        for(MyEntry myEntry : list){
            System.out.println(myEntry.getOb2());
        }
    }
	
	public void showMap(){
        for(MyEntry myEntry : list){
            System.out.println(myEntry.getOb1() + " ------ " + myEntry.getOb2());
        }
    }

}



















