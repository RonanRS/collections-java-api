package main.set.pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numeroContato;

    public Contato(String nome, int numeroContato) {
        this.nome = nome;
        this.numeroContato = numeroContato;
    }


    public String getNome() {
        return nome;
    }

    public int getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(int numeroContato) {
        this.numeroContato = numeroContato;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numeroContato=" + numeroContato +
                '}';
    }
}
