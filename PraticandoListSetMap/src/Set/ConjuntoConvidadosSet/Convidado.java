package Set.ConjuntoConvidadosSet;

import java.util.Objects;

public class Convidado {
    protected String nome;
    protected int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return this.nome;
    }
    public int getCodigoConvite() {
        return this.codigoConvite;
    }
    @Override
    public String toString() {
        return """
                Convidado: %s, portador do código: %d.
                """.formatted(this.nome,this.codigoConvite);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }

}
/*
        @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Convidado convidado = (Convidado) obj;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }

    ----------------------------------------------------------------

        @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }

 */