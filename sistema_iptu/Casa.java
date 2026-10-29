package sistema_iptu;

/** Tipo de imóvel usado no exercício de cálculo de IPTU. */
public class Casa extends Imovel {
    public Casa(Municipio municipio, Double areaM2, Integer vagas) {
        super(municipio, areaM2, vagas);
    }
}
