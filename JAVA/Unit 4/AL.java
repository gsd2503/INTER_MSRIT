import java.util.*;
class AL 
{
    public static void main (String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("The size of Array List is "+al.size());
        al.add("MSD");
        al.add("VK");
        al.add("RS");
        al.add("KLR");
        al.add("ST");
        System.out.println("The size of the ArrayList after adding is "+al.size());
        System.out.println(al);
        al.remove("ST");
        al.remove(2);
        System.out.println("the size of the ArrayList after removing 2 elements is "+ al.size());
        System.out.println(al);
        
        String sa[] = new String[al.size()];
        sa = al.toArray(sa);
        for(String i : sa)
        {
            System.out.println(i);
        }
    }
}
