
public class Card {
		private String Color;
		private int Face_Value;
		public Card(String Color, int Face_Value) 
		{
			this.Color = Color;
			this.Face_Value = Face_Value;
		}
		public String getColor() 
		{
			return Color;
		}
		public int getFaceValue() 
		{
			return Face_Value;
		}
		public String toString() 
		{
			String String_Convert = "" + Face_Value;
			if (Face_Value == 11) 
			{
				String_Convert = "J";
			} else if (Face_Value == 12) 
			{
				String_Convert = "Q";
			} else if (Face_Value == 13) 
			{
				String_Convert = "K";
			} else if (Face_Value == 14) 
			{
				String_Convert = "A";
			}
			return String_Convert + " of " + Color;
		}
	}

