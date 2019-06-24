package entities;

public class OutsourcedEmployee  extends Employee{
	
	// Aqui estamos criando o funcionario terceiro com
	// construtor get e set e sobrescrevendo o metodo da classe Employee
	// O metodo esta sendo sobrescrito e alterado.
	
	private Double additionalCharge;
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}	

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}	
	// O metodo sobrescrito e alterado da seguinte forma.
	// colocando return super.payment() ele traz todo o metodo o  + additionalCharge * 1.1
	// ou seja o q o metodo é diferente do outro
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	

}
