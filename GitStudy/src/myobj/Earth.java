package myobj;

public class Earth {
	static double rotation = 0.99727;
	static int revolution = 365;
	int population;
	
	static void Changerotation(double rotation, int revolution) {
		Earth.rotation = rotation;
		Earth.revolution = revolution;
	}
}
