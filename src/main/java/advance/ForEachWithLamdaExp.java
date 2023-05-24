package advance;

import java.util.ArrayList;
import java.util.List;
//https://www.youtube.com/watch?v=Wggc6Ziy8X8

public class ForEachWithLamdaExp {
    public static void main(String[] args){

        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(4);
        arrList.add(5);
        arrList.add(7);
        arrList.add(8);
        arrList.add(9);
        System.out.println("---------------external foreach----------------");
        //external foreach
        for (Integer i:arrList
             ) {
            System.out.println(i);
        }
        System.out.println("--------------normal external for loop-----------------");
        //normal external for loop
        for(int j =0 ; j <5;j++){
            System.out.println(arrList.get(j));
        }
        System.out.println("------------internal foreach introduced in java 8 consumables functional interface-------------------");
//internal foreach introduced in java 8
        arrList.forEach((n)->System.out.println(n));
        System.out.println("-------------internal foreach introduced in java 8 consumables functional interface different way------------------");
        arrList.forEach(n->System.out.println(n));
    }
}
