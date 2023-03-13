public enum Directions {
    NORTH(1, "North"),
		EAST(2, "East"),
		SOUTH(3, "South"),
		WEST(4, "West");

		private int optionNumber;
		private String displayValue;

		private Directions(int optionNumber, String displayValue) {
			this.optionNumber = optionNumber;
			this.displayValue = displayValue;
		}

		public int getOptionNumber() {
			return optionNumber;
		}

		public String getDisplayValue() {
			return displayValue;
		}

		public static Directions fromOptionNumber(int optionNumber) {
			for (Directions option : Directions.values()) {
				if (option.optionNumber == optionNumber) {
					return option;
				}
			}
			throw new IllegalArgumentException(String.format("Option %d is not valid.", optionNumber));
		}
}