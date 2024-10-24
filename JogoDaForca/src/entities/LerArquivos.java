package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerArquivos {

	
	public List<String> ler(){
		List<String> linhas = new ArrayList<>();
		
			try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dougl\\Documents\\palavras.txt"))) {
				String linha;
				
				while((linha = br.readLine()) != null) {
					linhas.add(linha);
				}
			} 
		    
			catch(IOException e) {
				  System.out.println("ERROR AO LER SEU ARQUIVO: " + e.getMessage());;
			}
			
		

		return linhas;
		
	}
	
}
