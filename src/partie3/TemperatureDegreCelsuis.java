package partie3;

import java.util.Scanner;

//Écrivez un programme qui lit une température en degrés Celsius dans une valeur double,
//puis le convertit en Fahrenheit et affiche le résultat.
//La formule de conversion est la suivante: Fahrenheit = (9/5) * Celsius + 32
public class TemperatureDegreCelsuis {

	public static void main(String[] args) {
		
		ConvertFahrenheit convertFahrenheit = new ConvertFahrenheit();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Entrer la température en degrés Celsuis : ");
			double temp = sc.nextDouble();
				
			System.out.println(temp);
			//System.out.println(convertFahrenheit.enFahrenheit(temp));
			
			System.out.println("La température "+temp+" en dégrés celsuis est égal en "+convertFahrenheit.enFahrenheit(temp)+" Fahrenheit ");
		}
		

	}

}
