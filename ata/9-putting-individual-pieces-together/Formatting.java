public class Formatting {
	String first = "1st";
	String second = "2nd";

	String defaultArgString = String.format("This string uses the default order of the %s and %s arguments.", first, second);

	String specifiedArgString = String.format("This string reverses the value arguments %2$s and %1$s using indices.", first, second);

	String flagString = String.format("%,d", 1000000);

	int sep = 9;
	int oct = 10;

	String widthString = String.format("%4d%n%4d", sep, oct);

	double countryArea = 3119884.692;

	String precisionString = String.format("The area of the country is %.2f.", countryArea);

	int points = 52;

	String widthString2 = String.format("The user has %03d points.", points);

	String formattedString = String.format("The area of the country is %,.2f square miles.", countryArea);

	double depth = -72.75;
	String unit = "inches";

	String formattedString2 = String.format("The pool depth below ground level is%n%2$(5.0f %1$s", unit, depth);

	public String formatLabeledValue(String label, int value) {
		String formattedString = String.format("%1$s:%n%2$d -> %2$+(,d", label, value);
		return formattedString;
	}
}

/*
Implement the formatLabeledValue method functionality to display a label above a value alongside the formatted value. The returned String should have the String type label parameter followed by a colon on the first line. The second line should have the int type parameter value just as it is received. This should be followed by a value separator -> with a space on both sides of it. Lastly the value should be shown again but with a + for positive values and wrap negative values in parentheses. Use commas as the thousands separator. Recall that an argument index or < flag can be used to apply the same argument to multiple format specifiers.

Example Method Calls:

formatLabeledValue("Profit", 123456);
formatLabeledValue("Deficit", -9870);

Expected Return Values:

Profit:
123456 -> +123,456
Deficit:
-9870 -> (9,870)
*/