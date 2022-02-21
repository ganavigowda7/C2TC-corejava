package technoserveb9;


public class foodfactory {
	public Food getFood(String order)
	{
		if(order==null)
			return null;
		else if(order.equalsIgnoreCase("pizza"))
			return new pizza();
		else if(order.equalsIgnoreCase("cake"))
			return new cake();
		else 
			return null;
	}

}
