package builder;

class Director {
	IBuilder myBuilder;

	// A series of steps.for the production
	public void Construct(IBuilder builder) {
		myBuilder = builder;
		myBuilder.BuildBody();
		myBuilder.InsertWheels();
		myBuilder.AddHeadlights();
	}
}
