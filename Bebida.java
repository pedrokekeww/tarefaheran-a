//subclasse 3 Pizzaria: Bebida
package pizzaria;
public class Bebida extends Alimentos {
	private double volume;
	private int gelo;
	
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public int getGelo() {
		return gelo;
	}
	public void setGelo(int gelo) {
		this.gelo = gelo;
	}
	@Override
	public String toString() {
		return "Bebida\nvolume = " + volume + "ml, gelo = " + gelo;
	}
	public String converteMlpL(double volume) {
		this.volume = volume/1000;
		return "O volume em Litros é:" + this.volume;
	}
}
