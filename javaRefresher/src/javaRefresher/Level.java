package javaRefresher;

public enum Level {
	HIGH(3), MEDIUM(2), LOW(1);

	private int levelNum;

	private Level(int num) {
		this.levelNum = num;
	}

	public int getLevel() {
		return this.levelNum;
	}
	
	public void setLevel(int num) {
		this.levelNum = num;
	}
}
