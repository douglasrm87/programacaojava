package padraoprojeto.aula03.prototype;

public class GolPrototype extends CarroPrototype {
	protected GolPrototype(GolPrototype golPrototype) {
		this.valorCompra = golPrototype.getValorCompra();
	}

	public GolPrototype() {
		this.valorCompra = 0.0;
	}

	@Override
	public String exibirInfo() {
		return "Modelo: Gol\nMontadora: Wolkswagen\n" + "Valor: R$“ + getValorCompra()";
	}

	@Override
	public CarroPrototype clonar() {
		return new GolPrototype(this);
	}

}
