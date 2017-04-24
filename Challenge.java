package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
driveDirect(500,500);
sleep(3000);
driveDirect(90,500);
sleep(700);
driveDirect(500,500);
sleep(750);
driveDirect(290,290);
sleep(3700);
driveDirect(500,500);
sleep(1500);
driveDirect(0,0);
driveDirect(500,290);
sleep(2500);






	}

	public void loop() {
	
	}
}
