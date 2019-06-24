package entities;

public class Employee {

	// Aqui iniciamos a class do funcionario onde
	// Criamos os atributos, construtor vazio e com argumentos + get e set + metodo de pagamento
	
	private String Name;
	private Integer hours;
	private Double valuePerHour;
	public Employee() {
	}
	public Employee(String name, Integer hours, Double valuePerHour) {
		Name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public double payment() {
		return hours * valuePerHour;
	}
	
	
}
