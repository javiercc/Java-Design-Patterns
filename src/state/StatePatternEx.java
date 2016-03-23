package state;

class StatePatternEx {
	public static void main(String[] args) {
		System.out.println("***State Pattern Demo***\n");
		// Initially TV is Off
		Off initialState = new Off();
		TV tv = new TV(initialState);
		// First time press
		tv.pressButton();
		// Second time press
		tv.pressButton();
		// Third time press
		tv.pressButton();
		// Fourth time press
		tv.pressButton();
	}
}
