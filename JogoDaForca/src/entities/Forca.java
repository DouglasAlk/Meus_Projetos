package entities;

import java.util.List;
import java.util.Random;

public class Forca {
     
	private List<String> nomes;
	private String palavraSecreta;
	private char[] progresso;
    private int vidas;
    private boolean venceu;
    
  
    public Forca() {
        //inicia o jogo com o nome que vai ser adivinhado!
        LerArquivos leitor = new LerArquivos();
        this.nomes = leitor.ler(); 
        this.palavraSecreta = nomeAleatorio(); 
        this.vidas = 6;
        this.progresso = new char[palavraSecreta.length()];
        this.venceu = false;

        for (int i = 0; i < progresso.length; i++) {
            progresso[i] = '_'; 
        }
    }





	// usa os nomes da lista e retorna um random 
	public String nomeAleatorio() {
		
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(nomes.size()); 
		
		return nomes.get(numeroAleatorio).toUpperCase();
		
	}
	
	public Boolean veificaLetra (char letra) {
		letra = Character.toUpperCase(letra);
		venceu = false;
		Boolean acertou = false;
		
		for (int i = 0 ; i < palavraSecreta.length(); i++) {
			
			if (palavraSecreta.charAt(i) == letra) {
				progresso[i] = letra;
				acertou = true;
			}
			
		}
		
		if (!acertou) {
			vidas -= 1;
		}
		
		
		return acertou;
	}
	
	
	public Boolean verificaSeVenceu() {
	
		return String.valueOf(progresso).equals(palavraSecreta);
	}
	
	public Boolean possuiVida() {
		return vidas > 0;
	}



	public String getPalavraSecreta() {
		return palavraSecreta;
	}



	public int getVidas() {
		return vidas;
	}


	public String getProgresso() {
		return String.valueOf(progresso);
	}


    
	
	
	
}
