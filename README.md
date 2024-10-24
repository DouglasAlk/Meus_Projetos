## 🩻 Jogo da Forca
Pronto para testar suas habilidades adivinhando a palavra?

### Como funciona❓

1. O jogo escolhe uma palavra aleatória.
2. Você tem 6 vidas para acertar a palavra.
3. Digite uma letra por vez para adivinhar.
4. Errou? Você perde uma vida. 😬
5. Acertou? A letra será revelada na palavra.
6. O jogo termina quando você acerta a palavra ou perde todas as vidas!

### Estrutura do Projeto 🔍

Application/Program.java: Classe principal que executa o jogo.
entities/Forca.java: Contém a lógica do jogo da forca, como verificar letras, controlar vidas e atualizar o progresso.
entities/LerArquivos.java: Responsável por ler o arquivo externo contendo as palavras que serão usadas no jogo.

### Tecnologias Utilizadas 🧑‍💻

* Java: Linguagem de programação.
* BufferedReader: Para leitura de palavras de um arquivo de texto.
* Scanner: Para capturar a entrada do usuário.
* Random: Para selecionar uma palavra aleatória do arquivo de palavras.
* Tratamento de Exceções: Para garantir que o jogo seja robusto e não quebre ao tentar ler um arquivo inexistente.
