//subclasse 1 Pizzaria: Pizza
package pizzaria;

public class Pizza extends Alimentos
{
	private String borda;
	private double fatia;
	
	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}

	public double getFatia() {
		return fatia;
	}

	public void setFatia(double fatia) {
		this.fatia = fatia;
	}
	
	@Override
	public String toString() 
	{
		return "Pizza" + "\nborda = " + borda + "\nfatia = " + fatia;
	}

	public String numFatiaspPessoa(double pessoas) 
	{
		if (fatia >= pessoas) 
		{
			double result = fatia/pessoas;
			return "A quantidade de fatias para cada pessoa é " +result+ "!!";
		}
		else 
		{
			return "Compre mais pizza.";
		}
	}
}
