//subclasse 2 pizzaria: Esfiha
package pizzaria;
public class Esfirra extends Alimentos
	{
		private String molho;
		private double quantidade;
		
		public String getMolho() {
			return molho;
		}

		public void setMolho(String molho) {
			this.molho = molho;
		}

		public double getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(double quantidade) {
			this.quantidade = quantidade;
		}

	@Override
	public String toString() {
		return "Esfirra" + "\nmolho = " + molho + ", quantidade = " + quantidade;
		}
	public double Caixas() {
		return (this.quantidade/3);
		}
	}	

