package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import calculos.CustoTotal;
import calculos.PesoCubado;
import calculos.Produtividade;
import calculos.TaxaDeFrete;

public class Main {
	
	public static void main (String args []) {
		
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Bem vindo");
			System.out.println("1 - Custo total");
			System.out.println("2 - Peso Cubado");
			System.out.println("3 - Taxa de frete");
			System.out.println("4 - Produtividade");
			System.out.println("5 - Todos juntos");
			System.out.print("Digite a opção: ");
			int op = sc.nextInt();
			sc.nextLine();
			switch(op) {
			case 1:
				System.out.print("Digite os custos fixos: ");
				double cf = sc.nextDouble();
				System.out.print("Digite os custos variados: ");
				double cv = sc.nextDouble();
				System.out.print("Digite a quantidade de KM: ");
				double km = sc.nextDouble();
				
				CustoTotal custo = new CustoTotal(cf,cv,km);
				
				System.out.println("Custo Total = " + custo.custoTotal());
				break;
				
			case 2:
				System.out.print("Digite a altura do objeto: ");
				double altura = sc.nextDouble();
				System.out.print("Digite a profundidade do objeto: ");
				double profundidade = sc.nextDouble();
				System.out.print("Digite a largura do objeto: ");
				double largura = sc.nextDouble();
				System.out.print("Digite o peso real do objeto: ");
				double peso = sc.nextDouble();
				System.out.print("Digite o numero de caixas do objeto: ");
				int caixa = sc.nextInt();
				sc.nextLine();
				PesoCubado cubado = new PesoCubado(peso,profundidade,altura,largura,caixa);
				System.out.println("Peso cubado total = " + cubado.pesoCubadoRodovia());
				System.out.println(cubado);
				break;
			
			case 3:
				System.out.print("Digite os custos fixos: ");
				cf = sc.nextDouble();
				System.out.print("Digite os custos variados: ");
				cv = sc.nextDouble();
				System.out.print("Digite a quantidade de KM: ");
				km = sc.nextDouble();
				System.out.print("Digite a taxa de lucro: ");
				double taxa = sc.nextDouble();
				
				TaxaDeFrete frete = new TaxaDeFrete(cf, cv, km, taxa);
				
				System.out.println("Taxa de frete = " + frete.taxaDeFrete());
				break;
			
			case 4:
				System.out.print("Digite a quantidade de KM: ");
				km = sc.nextDouble();
				System.out.print("Digite o numero de dias: ");
				int dia = sc.nextInt();
				sc.nextLine();
				System.out.print("Digite o numero de horas: ");
				double horas = sc.nextDouble();
			    System.out.print("digite o tempo de descarga: ");
			    double descarga = sc.nextDouble();
			    System.out.print("digite o tempo de carga: ");
			    double carga = sc.nextDouble();
			    
			    Produtividade produtividade = new Produtividade(km, dia, horas, descarga, carga);
			    
			    System.out.println("Produtividade = " + produtividade.produtividade());
			    break;
			    
			case 5:
				System.out.print("Digite os custos fixos: ");
				cf = sc.nextDouble();
				System.out.print("Digite os custos variados: ");
				cv = sc.nextDouble();
				System.out.print("Digite a quantidade de KM: ");
				km = sc.nextDouble();
				System.out.print("Digite a taxa de lucro: ");
				taxa = sc.nextDouble();
				System.out.print("Digite a altura do objeto: ");
				altura = sc.nextDouble();
				System.out.print("Digite a profundidade do objeto: ");
				profundidade = sc.nextDouble();
				System.out.print("Digite a largura do objeto: ");
				largura = sc.nextDouble();
				System.out.print("Digite o peso real do objeto: ");
				peso = sc.nextDouble();
				System.out.print("Digite o numero de caixas do objeto: ");
				caixa = sc.nextInt();
				sc.nextLine();
				System.out.print("Digite o numero de dias: ");
				dia = sc.nextInt();
				sc.nextLine();
				System.out.print("Digite o numero de horas: ");
				horas = sc.nextDouble();
			    System.out.print("digite o tempo de descarga: ");
			    descarga = sc.nextDouble();
			    System.out.print("digite o tempo de carga: ");
			    carga = sc.nextDouble();
			    
			    custo = new CustoTotal(cf,cv,km);
				System.out.println("Custo Total = " + custo.custoTotal());
				
				cubado = new PesoCubado(peso,profundidade,altura,largura,caixa);
				System.out.println("Peso cubado total = " + cubado.pesoCubadoRodovia());
				System.out.println(cubado);
				
				frete = new TaxaDeFrete(cf, cv, km, taxa);
				
				System.out.println("Taxa de frete = " + frete.taxaDeFrete());
				
				if(cubado.pesoRodovia()) {
					System.out.println("preço de frete = " + (frete.taxaDeFrete() * cubado.pesoCubadoRodovia()));
				}else {
					System.out.println("preço de frete = " + (frete.taxaDeFrete() * cubado.peso()));
				}
				
				produtividade = new Produtividade(km, dia, horas, descarga, carga);  
				System.out.println("Produtividade = " + produtividade.produtividade());
			    
			}
			
			
		}catch(InputMismatchException e) {
			System.out.println("ERRO: " + e.getMessage());
		}finally {
			sc.close();
		}
		
		
		
	}
	
	
	

}
