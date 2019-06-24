package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Aqui vamos criar uma lista para salvar os funcionarios
		List<Employee> list = new ArrayList<>(); 
		
		System.out.println("Enter the number of employees: ");
		// ler a qtd de funcionario
		int n = sc.nextInt();
		
		// for para ler a qtd de funcionarios
		for (int i=1;i<n;i++) {
			System.out.println("Employee #" + i + " data:"); // O + i + q vai salvar na lista q é o 1* funcionario
			System.out.print("Outsourced (y/n)");
			char ch = sc.next().charAt(0);// criarmos uma variavel para ler o caracter
			System.out.print("Name: ");
			sc.nextLine(); // fazemos isso para consumir a quebra de linha
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') { // caso se 3* add a condição abaixo
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				// Aqui instanciamos o funcionario 3* com construtor
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge); 
				// agora vamos add na minha lista
				list.add(emp);
			}
			else {
				// Aqui instanciamos o funcionario
				Employee emp = new Employee(name, hours, valuePerHour); 
				list.add(emp);
				// Outra forma de fazer a mesma coisa é colocar a instancia dentro do add
				// segue exemplo	list.add(new Employee(name, hours, valuePerHour);
			}
				// Como demonstrar o pagamento do funcionarios
			System.out.println();
			System.out.println("Payments");
			for (Employee emp : list) {
				System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));
			}
			
		}
		
		
		sc.close();
		

	}

}
