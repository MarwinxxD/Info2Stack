package Klausurvorbereitung;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class LuggageContainer implements Iterator <Luggage>{
	
	private ArrayList <Luggage> al = new ArrayList <>();

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Luggage next() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addLuggage(Luggage l) {
		
		al.add(l);
		
	}
	
	public void removeLuggage(Luggage l) {
		
		al.remove(l);
		
	}

	public Stream<Luggage> stream() {
		return al.stream();
	}
}
