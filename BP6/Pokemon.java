package BP6;

public class Pokemon {

	private String name;

	private int maxHp;

	private int currentHp;
	

	public String getName() {
		return name;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public int getCurrentHp() {
		return currentHp;
	}
	
	public boolean isFainted() {
		if ( currentHp<=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int takeDamage(int damage) {
		
		if ( damage>= currentHp) {
			currentHp =0;
		}else {
			currentHp = currentHp-damage;
		}
		
		return currentHp;
	}
	
	public int heal() {
		
		currentHp = maxHp;
		
		return currentHp;
	}
	
	public int heal(int health) {
		
		if (currentHp+health>= maxHp) {
			currentHp=  maxHp;
		}else {
			currentHp= currentHp + health;
		}
		
		return currentHp;
	}
	
	@Override
	public String toString() {
		return name+" with "+currentHp+"/"+maxHp+"HP";
	}

	Pokemon(String name, int maxHp) {

		this.name = name;

		if (maxHp >= 1) {

			this.maxHp = maxHp;
			currentHp = maxHp;

		} else {
			throw new IllegalArgumentException("u are wrong, u give negative hp");
		}
	}


}
