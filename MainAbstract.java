/**
 * 
 */

/**
 * @author varunverma
 *
 */
abstract class Instrument {

	int freq;

	abstract void play();

}

class StringedInstrument extends Instrument {

	int numberOfStrings=10;

	@Override
	void play() {
		System.out.println("Lets play: " + numberOfStrings);

	}

}

class ElectricGuitar extends StringedInstrument {
	int numberOfStrings=10;

	@Override
	void play() {
		System.out.println("Lets play: " + numberOfStrings);

	}
}

class ElectricBassGuitar extends StringedInstrument {
	int numberOfStrings=100;

	@Override
	void play() {
		System.out.println("Lets play: " + numberOfStrings);

	}
}

class MainAbstract {
	public static void main(String args[]) {

		ElectricBassGuitar ebg = new ElectricBassGuitar();
		ebg.play();
		
		ElectricGuitar eg = new ElectricGuitar();
		eg.play();
		
	}
}
