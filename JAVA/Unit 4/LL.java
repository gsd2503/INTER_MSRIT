import java.util.*;

class LL 
{
    public static void main (String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("The size of the linked list is "+ ll.size());
        ll.add("MSD");
        ll.add("VK");
        ll.add("RS");
        ll.add("ABD");
        ll.add("DV");
        System.out.println("The size of the LinkedList after adding is "+ ll.size());
        System.out.println(ll);
        ll.remove("DV");
        ll.remove(3);
        System.out.println(ll);
        ll.add("ABD");
        ll.add("DV");
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
