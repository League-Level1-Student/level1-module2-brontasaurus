package _06_minion;

public class Minion {

	private String name; 
		private int eyes; 
		private String color; 
		private String master;
		
		void setMaster(String banana) {
			master = banana;
		}
		
		int getEyes() {
			return eyes;
		}
		String getColor() {
			return color;
		}
		String getMaster() {
			return master;
		}
		String getName() {
			return name;
		}
		
		public Minion(String name, int eyes, String color, String master) {
			this.name=name;
			this.eyes=eyes;
			this.color=color;
			this.master=master;
		}
		
}
