package javaRefresher;

public class Car implements Vehicle {

	private int gear = 1;
	private int speed = 0;

	@Override
	public void slowDown(int a) {
		// TODO Auto-generated method stub
		this.speed -= a;
	}

	@Override
	public void speedUp(int a) {
		// TODO Auto-generated method stub
		this.speed += a;
	}

	@Override
	public void changeGear(int a) {
		// TODO Auto-generated method stub
		this.gear = a;
	}

	public void display() {
		String dsp = String.format("Speed: %s, Gear: %s", this.speed, this.gear);
		System.out.println(dsp);
		out();
	}

}
