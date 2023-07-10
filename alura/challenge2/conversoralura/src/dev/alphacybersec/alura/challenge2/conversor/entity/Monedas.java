package dev.alphacybersec.alura.challenge2.conversor.entity;

public enum Monedas {

    M1("Euro",1.10, 0.91, "\u20AC","Euros"),
    M2("Libra Esterlina", 1.2717, 0.79,"\u00A3","Libras Esterlinas"),
    M3("Yen Japonés", 0.01, 144.43,"\u00A5", "Yenes Japoneses" ),
    M4("Won Sul-Coreano", 0.00077203343, 1259.51,"\u20A9", "Wones sul-coreanos");

    private final String MONEDA;
    private final Double VALORMONEDAUSD;
    private final Double VALORUSDMONEDA;
    private final String MONEDASIMBOLO;
    private final String MONEDAPLURAL;

    Monedas(String MONEDA, Double VALORMONEDAUSD, Double VALORUSDMONEDA, String MONEDASIMBOLO, String MONEDAPLURAL) {
        this.MONEDA = MONEDA;
        this.VALORMONEDAUSD = VALORMONEDAUSD;
        this.VALORUSDMONEDA = VALORUSDMONEDA;
        this.MONEDASIMBOLO = MONEDASIMBOLO;
        this.MONEDAPLURAL = MONEDAPLURAL;
    }

    public String getMONEDA() {
        return MONEDA;
    }

    public Double getVALORMONEDAUSD() {
        return VALORMONEDAUSD;
    }

    public Double getVALORUSDMONEDA() {
        return VALORUSDMONEDA;
    }

    public String getMONEDASIMBOLO() {
        return MONEDASIMBOLO;
    }

    public String getMONEDAPLURAL() {
        return MONEDAPLURAL;
    }
}
