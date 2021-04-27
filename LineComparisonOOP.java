public class LineComparisonOOP {
	
	//variables
	private double length_of_line;
	private int x1, x2, y1, y2;

	//Parameter constructor
	public LineComparisonOOP(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		}

	 // calculating length of line 1 and 2
	public double lengthOfLine() {
		length_of_line = Math.sqrt( (x2 - x1) * (x2 - x1)  + (y2- y1) * (y2- y1) );
		return Math.round(length_of_line * 100.0)/100.0;
		}

		// Overriding equals() Method
    public boolean equals(LineComparisonOOP Line_2)
    {	boolean equalityValue;

        if(this.lengthOfLine() == Line_2.lengthOfLine())
            equalityValue = true;
        else
            equalityValue = false;

        return equalityValue;
    }

    // Overriding compareTo() Method
    public int compareTo(LineComparisonOOP Line_2) {
        int compareValue;

        if(this.lengthOfLine() == Line_2.lengthOfLine())
            compareValue = 0;
        else if(this.lengthOfLine() > Line_2.lengthOfLine())
            compareValue = 1;
        else compareValue = -1;

        return compareValue;
    }


	public static void main(String[] args) {
		System.out.println( "Welcome to Line Comparison Computation OOP Program" );

		// Co-ordinates Generation for 4 Points on Lines 1 & 2
        int x1 = (int)(Math.floor(Math.random()*10));
        int y1 = (int)(Math.floor(Math.random()*10));
        int x2 = (int)(Math.floor(Math.random()*10));
        int y2 = (int)(Math.floor(Math.random()*10));
        int x3 = (int)(Math.floor(Math.random()*10));
        int y3 = (int)(Math.floor(Math.random()*10));
        int x4 = (int)(Math.floor(Math.random()*10));
        int y4 = (int)(Math.floor(Math.random()*10));

        // Instantiating Objects
        LineComparisonOOP Line_1 = new LineComparisonOOP(x1, y1, x2, y2);
        LineComparisonOOP Line_2 = new LineComparisonOOP(x3, y3, x4, y4);

        System.out.println("length of line 1 is "+Line_1.lengthOfLine() );
        System.out.println("length of line 2 is "+Line_2.lengthOfLine() );
	
		boolean equality_check = Line_1.equals(Line_2);
		int compare_value = Line_1.compareTo(Line_2);

        // Display if Two are Equal or Not Equal
        if(equality_check)
            System.out.println("Lines are Equal");
        else
            System.out.println("Lines are Not Equal");

        // Display of Comparison of Two lines
        if (compare_value > 0)
            System.out.println("Length of Line 1 is greater than Line 2");
        else if (compare_value < 0)
            System.out.println("Length of Line 1 is less than Line 2");
        
	}

}