package sistema_iptu;

/** Tipo de imóvel usado no exercício de cálculo de IPTU. */
public class Chacara extends Imovel {
    private Boolean possuiPocoArtesiano;

    public Chacara(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiPocoArtesiano) {
        super(municipio, areaM2, vagas);
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }

    public Boolean isPossuiPocoArtesiano() { return this.possuiPocoArtesiano; }

    public Boolean getPossuiPocoArtesiano() { return this.possuiPocoArtesiano; }

    public void setPossuiPocoArtesiano(Boolean possuiPocoArtesiano) {
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }
}
