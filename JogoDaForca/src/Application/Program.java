package Application;

import java.util.Scanner;

import entities.Forca;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Forca jogo = new Forca();
		
		System.out.println("Ola vamos começar o jodo da forca :) ");
		System.out.println("Digite apenas uma letra por vez, caso digite mais sera considerada a primeira!");
		System.out.println();
		System.out.print("Me diz seu nome: ");
		String nome = sc.nextLine();
		System.out.println();
		System.out.println();
		System.out.println("Ok " + nome + " boa sorte!" );
		System.out.println();
		System.out.println("A palavra tem " + jogo.getPalavraSecreta().length() + " letras!");
		
		System.out.print("[ ");
		for(int i=0 ; i < jogo.getPalavraSecreta().length() ; i++) {
			System.out.print("__ ");
		}
		System.out.print(" ]");
		
		System.out.println();
		
		while(jogo.possuiVida() && !jogo.verificaSeVenceu()) {
			
			System.out.println();
			System.out.println("Palavra: " + jogo.getProgresso());
            System.out.println("Vidas restantes: " + jogo.getVidas());
            System.out.print("Digite uma letra: ");
            
            char tentativa = sc.next().charAt(0);
            
            if (jogo.veificaLetra(tentativa)) {
            	System.out.println();
                System.out.println("---------- Você acertou! ----------");
            } else {
            	System.out.println();
                System.out.println("---------- Letra incorreta! ----------");
            }
        }

        if (jogo.verificaSeVenceu()) {
        	System.out.println();
        	System.out.println("----------------------------------------------------");
            System.out.println("Parabéns! Você venceu. A palavra era: " + jogo.getPalavraSecreta());
            System.out.println("----------------------------------------------------");
        } else {
        	System.out.println();
            System.out.println("Você perdeu! A palavra era: " + jogo.getPalavraSecreta());
        }
        
        sc.close();
		}
		

	}


