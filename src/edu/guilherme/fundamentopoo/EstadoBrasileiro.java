package edu.guilherme.fundamentopoo;

public enum EstadoBrasileiro {
    // OBJETOS PRÉ-DEFINIDOS
    RONDONIA("RO", "Rondônia", 11),
    ACRE("AC", "Acre", 12),
    AMAZONAS("AM", "Amazonas", 13),
    RORAIMA("RR", "Roraima", 14),
    PARÁ("PA", "Pará", 15),
    AMAPÁ("AP", "Amapá", 16),
    TOCANTINS("TO", "Tocantins", 17),
    MARANHAO("MA", "Maranhão", 21),
    PIAUI("PI", "Piauí", 22),
    CEARA("CE", "Ceará", 23),
    RIO_GRANDE_NORTE("RN", "Rio Grande do Norte", 24),
    PARAIBA("PB", "Paraíba", 25),
    PERNAMBUCO("PE", "Pernambuco", 26),
    ALAGOAS("AL", "Alagoas", 27),
    SERGIPE("SE", "Sergipe", 28),
    BAHIA("BA", "Bahia", 29),
    MINAS_GERAIS("MG", "Minas Gerais", 31),
    ESPIRITO_SANTO("ES", "Espirito Santo", 32),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 33),
    SAO_PAULO("SP", "São Paulo", 35),
    PARANA("PR", "Paraná", 41),
    SANTA_CATARINA("SC", "Santa Catarina", 42),
    RIO_GRANDE_SUL("RS", "Rio Grande do Sul", 43),
    MATO_GROSSO_SUL("MS", "Mato Grosso do Sul", 50),
    MATO_GROSSO("MT", "Mato Grosso", 51),
    GOIAS("GO", "Goiás", 52),
    DISTRITO_FEDERAL("DF", "Distrito Federal", 53);

    private String nome;
    private String sigla;
    private int ibge;
    
    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
    public int getIbge() {
        return ibge;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}