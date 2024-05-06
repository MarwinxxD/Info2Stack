public class a {
	public String myToLowerCase(String s)
	{
		int change = 0;
		char[] news = s.toCharArray();
		for(int i = 0; i < s.length(); i++)
		{
			if((int) news[i] > 64 && (int) news[i] < 91) {
				change = (int) news[i];
				change = change + 32;
				news[i] = (char) change;
			}
		}
		s = new String(news);
		return s;
	}
}
