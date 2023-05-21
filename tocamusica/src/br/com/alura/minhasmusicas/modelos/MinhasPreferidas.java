package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    //Métodos Principais
    public void inclui (Audio audio) {
        if (audio.getClassificacao() >=9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " é uma ótima opção para incuir na sua lista.");
        }
    }
}
