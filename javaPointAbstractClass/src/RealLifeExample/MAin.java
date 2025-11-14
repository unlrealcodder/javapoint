package RealLifeExample;
abstract class Game{
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	public final void play() {
		
		System.out.println("welcome to the play method");
		initialize();
		startPlay();
		endPlay();
		
	}
}
class Cricket extends Game{

	@Override
	void initialize() {
		System.out.println("cricket game initialized");
		
	}

	@Override
	void startPlay() {
		System.out.println("cricket game is started");
		
	}

	@Override
	void endPlay() {
		System.out.println("cricket game is ended");
		
	}
	
}

public class MAin{
	public static void main(String[] args) {
		Game obj=new Cricket();
		obj.play();
	}
}