public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private double cilindrada;
    private int estanque;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.BLANCO;
    private static int estanqueEstatico = 50;

    private static int ultimoId;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAXIMA_CIUDAD = 50;

    public final static String COLOR_ROJO = "rojo";
    public final static String COLOR_AZUL = "azul";
    public final static String COLOR_BLANCO = "blanco";
    public final static String COLOR_NEGRO = "negro";

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Automovil() {
        this.id= ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int estanque) {
        this(fabricante, modelo, color,cilindrada);
        this.estanque = estanque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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

    public static double calcularConsumoEstatico(int kms, int porcentajeBencina){
        return kms / (Automovil.estanqueEstatico*(porcentajeBencina/100d));
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getEstanqueEstatico() {
        return estanqueEstatico;
    }

    public static void setEstanqueEstatico(int estanqueEstatico) {
        Automovil.estanqueEstatico = estanqueEstatico;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }else if(!(obj instanceof Automovil a)){
            return false;
        }else{
            return this.fabricante.equals(a.fabricante) && this.modelo.equals(a.modelo);
        }
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "ID= "+ id + ","+
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo.getDescripcion() + '\'' +
                ", color='" + color.getColor() + '\'' +
                ", cilindrada=" + cilindrada +
                ", estanque=" + estanque +
                ", Color patente " + colorPatente.getColor()+
                '}';
    }
}
