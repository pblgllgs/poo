public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int estanque;

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int estanque) {
        this(fabricante, modelo, color,cilindrada);
        this.estanque = estanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getEstanque() {
        return estanque;
    }

    public void setEstanque(int estanque) {
        this.estanque = estanque;
    }

    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " acelerando a " + rpm+ " rpm";
    }
    public String frenar(){
        return "El auto " + this.fabricante + " frenando";
    }

    public String acelerarFrenar(){
        return this.acelerar(150) +", "+ this.frenar();
    }

    public double calcularConsumo(int kms, float porcentajeBencina){
        return kms / (estanque*porcentajeBencina);
    }

    public double calcularConsumo(int kms, int porcentajeBencina){
        return kms / (estanque*(porcentajeBencina/100d));
    }

    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj;
        return this.fabricante.equals(a.fabricante) && this.modelo.equals(a.modelo);
    }
}
