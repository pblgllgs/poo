public enum Color {

    ROJO("Rojo"),
    NEGRO("Negro"),
    BLANCO("Blanco"),
    AZUL("Azul"),
    NARANJA("Naranja");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
