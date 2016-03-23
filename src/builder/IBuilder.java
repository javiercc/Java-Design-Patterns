package builder;

interface IBuilder {
	void BuildBody();

	void InsertWheels();

	void AddHeadlights();

	Product GetVehicle();
}