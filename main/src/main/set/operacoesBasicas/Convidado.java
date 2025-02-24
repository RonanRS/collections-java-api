package main.set.operacoesBasicas;

import java.util.Objects;

public class Convidado {
    // Atributos
    private String nome;
    private int codConvite;

    public Convidado(String nome, int codConvite) {
        this.codConvite = codConvite;
        this.nome = nome;
    }

    public int getCodConvite() {
        return codConvite;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codConvite == convidado.codConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "codConvite=" + codConvite +
                ", nome='" + nome + '\'' +
                '}';
    }
}
