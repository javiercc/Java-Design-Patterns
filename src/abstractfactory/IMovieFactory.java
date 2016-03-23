package abstractfactory;

interface IMovieFactory {
	ITollywoodMovie GetTollywoodMovie();

	IBollywoodMovie GetBollywoodMovie();
}
