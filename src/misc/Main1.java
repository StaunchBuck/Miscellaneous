package misc;

import java.util.TreeSet;

public class Main1
{
        public static void main(String[] ar) {
        	Drink one = new Drink();
            Drink two = new Drink();
            one.name="Coffee";
            two.name ="Tea";
            TreeSet set = new TreeSet();
            set.add(one);
            set.add(two);   
            for(Object d:set){
                System.out.println(((Drink)d).name);
            }
        }
    
}

class Drink implements Comparable{
    public String name;
    public int compareTo(Object o){
        return 0;
    }
}