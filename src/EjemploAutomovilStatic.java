public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setEstanqueEstatico(35);

        Automovil tesla = new Automovil("tesla","plaid",Color.NEGRO,2.5,100);
        tesla.setTipo(TipoAutomovil.SEDAN);
        Automovil mazda = new Automovil("mazda","sport",Color.AZUL,3.5,150);
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        Automovil navara = new Automovil("nissan","navara",Color.BLANCO,4.0,200);
        navara.setTipo(TipoAutomovil.PICK_UP);
        Automovil navara2 = new Automovil("nissan","navara",Color.ROJO,4.0,200);
        navara2.setTipo(TipoAutomovil.PICK_UP);

        System.out.println((navara.equals(navara2)? "son iguales":"no son iguales"));

        Automovil automovil = new Automovil();

        System.out.println((navara.equals(automovil)? "son iguales":"no son iguales"));

        Automovil.setColorPatente(Color.BLANCO);

        System.out.println(navara.toString());
        System.out.println(mazda.toString());
        Automovil.setColorPatente(Color.NARANJA);
        System.out.println(tesla.toString());

        System.out.println(Automovil.calcularConsumoEstatico(300,65));

        System.out.println("Velocidad maxima carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad maxima ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD);

        System.out.println(Automovil.getColorPatente().getColor());
    }
}
