package dev.alphacybersec.alura.challenge2.conversor.entity;

public class Moneda {

    private String nombreMoneda;
    private Double cantidadConvertir;
    private Double conversion;
    private Integer tipoConversion;


    public Moneda() {
    }


    public Moneda(String nombreMoneda, Double cantidadConvertir, Double conversion, Integer tipoConversion) {
        this.nombreMoneda = nombreMoneda;
        this.cantidadConvertir = cantidadConvertir;
        this.conversion = conversion;
        this.tipoConversion = tipoConversion;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }

    public Double getCantidadConvertir() {
        return cantidadConvertir;
    }

    public void setCantidadConvertir(Double cantidadConvertir) {
        this.cantidadConvertir = cantidadConvertir;
    }

    public Double getConversion() {
        return conversion;
    }

    public void setConversion(Double conversion) {
        this.conversion = conversion;
    }

    public Integer getTipoConversion() {
        return tipoConversion;
    }

    public void setTipoConversion(Integer tipoConversion) {
        this.tipoConversion = tipoConversion;
    }

    @Override
    public String toString() {

        String resultado ="";

        String simboloMoneda = null;
        String monedaPlural = null;
        for(Monedas mon : Monedas.values()){
            if(mon.getMONEDA().equals(this.nombreMoneda)){
                simboloMoneda = mon.getMONEDASIMBOLO();
                monedaPlural = mon.getMONEDAPLURAL();
            }
        }

        if(tipoConversion ==1){
            resultado += "Moneda: " + nombreMoneda + " a Dólar" +
                    "\nCantidad Ingresada en " + monedaPlural+ " : " + simboloMoneda + cantidadConvertir +
                    "\nConversión a Dólar: $" + conversion;
        }else{
            resultado += "Moneda: Dólar a " + nombreMoneda +
                    "\nCantidad Ingresada en Dólares: $" + cantidadConvertir +
                    "\nConversión a " + monedaPlural + " : " + simboloMoneda + conversion;
        }

        return  resultado;

    }
}
