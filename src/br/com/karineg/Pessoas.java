package br.com.karineg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoas {

	public static void main(String[] args) {
		//método scenner para ler as entradas do usuário para formar a lista
		Scanner scanner = new Scanner(System.in);
		
		//criar a lista para armazenar os nomes 
		List<String> listaDePessoas = new ArrayList<>();
		
		//mensagem para o usuário na tela 
		System.out.println("Digite o nome e o sexo da pessoa que gostaria de adicionar a lista\n");
		
		//mensagem de intrução 
		System.out.println("Instruções: Digite primeiro o nome e depois o sexo da pessoa, como o exemplo: Karine Gawlik, feminino.\nQuando finalizar, digite sair para encerrar.\n\nDigite o nome e o sexo: ");
		
		
		//usando o while para saber quantas pessoas vão ser adicionadas na lista
		while (true) {
			String entrada = scanner.nextLine();
			
			//quando o usuário digitar sair o programa para de rodar e imprime as listas
			if (entrada.equalsIgnoreCase("sair")) {
				break;
			}
			
			//adicionar as pessoas que o usuario digitou na entrada na lista
			listaDePessoas.add(entrada);
		}
		
		//novos arraylist para cada tipo masculino e feminino
		List<String> grupoMasculino = new ArrayList<>();
		List<String> grupoFeminino = new ArrayList<>();
		
		for (String pessoa : listaDePessoas) {
			
			//Define os tipos de dados, são separados por uma virgula. O split divide em 2 partes a entrada 
			String[] dados = pessoa.split(",");
			if (dados.length != 2) {
				System.out.println("Entrada inválida: " + pessoa);
			}
			
			//trim é uma função que remove os espaços em branco no inicio e fim da string. Processando a entada do usuário
			String nome = dados[0].trim();
			String sexo = dados[1].trim();
			
			//essa parte do código vai comparar o valor do sexo e adicinar a lista certa e se não pertencer a masculino ou feminino retorna a msg de erro
			if (sexo.equalsIgnoreCase("masculino")) {
				grupoMasculino.add(nome);
			} else if (sexo.equalsIgnoreCase("feminino")) {
				grupoFeminino.add(nome);
			} else {
				System.out.println("Sexo inválido para a entrada: " + pessoa);
			}
		}
		
		//imprime na tela as duas listas
		System.out.println("Grupo Masculino: " + grupoMasculino);
		System.out.println("Grupo Femino: " + grupoFeminino);

	} 
	

}
