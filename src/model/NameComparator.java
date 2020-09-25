package model;
import java.util.Comparator;

public class NameComparator implements Comparator<Client>{

    @Override
    public int compare(Client o1, Client o2) {
        int comp;
		String n1 = o1.getName();
		String n2 = o2.getName();
		
		comp = n1.compareTo(n2);
        return comp;
    }


}
