package adapter;

class ClassAdapter extends IntegerValue {
	// Incrementing by 2
	public int getInteger() {
		return 2 + super.getInteger();
	}
}