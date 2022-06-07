package Aulacar;

	public class Polo extends Carro {
		private String corCarro;
	
		public String getCorcarro() {
			return corCarro;
		}

		public void setCorCarro(String corCarro) {
			this.corCarro = corCarro;
		}

		@Override
		protected void tipoModelo() {
			System.out.println("Sedan");
		}

		@Override
		protected void tamanhoMala() { 
			System.out.println("Grande");
		}

		
	}