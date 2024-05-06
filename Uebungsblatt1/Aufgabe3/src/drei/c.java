package drei;

public class c {
	public int arrayprod(int[] intarr)
	{
		int erg = 1;
		
		if(intarr.length == 0) {
			return 1;
		}
		
		for(int i = 0; i < intarr.length; i++)
		{
			erg = erg * intarr[i];
		}
		return erg;
	}
}
