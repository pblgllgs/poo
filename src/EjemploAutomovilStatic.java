public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setEstanqueEstatico(35);

        Automovil tesla = new Automovil("tesla","plaid",Color.NEGRO,new Motor(0,TipoMotor.ELECTRICO),new Estanque(100));
        Automovil mazda = new Automovil("mazda","sport",Color.ROJO,new Motor(2.5,TipoMotor.BENCINA),new Estanque(80));
        Automovil navara = new Automovil("nissan","navara",Color.BLANCO,new Motor(3,TipoMotor.DIESEL),new Estanque(90));
        Automovil navara2 = new Automovil("nissan","navara",Color.AZUL,new Motor(3,TipoMotor.BENCINA),new Estanque(70));

        tesla.setTipo(TipoAutomovil.SEDAN);
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        navara.setTipo(TipoAutomovil.PICK_UP);
        navara2.setTipo(TipoAutomovil.PICK_UP);

        System.out.println((navara.equals(navara2)? "son iguales":"no son iguales"));

        Automovil automovil = new Automovil();

        System.out.println((navara.equals(automovil)? "son iguales":"no son iguales"));

        Automovil.setColorPatente(Color.BLANCO);

        System.out.println(navara.verDetalle());
        System.out.println(mazda.verDetalle());
        Automovil.setColorPatente(Color.NARANJA);
        System.out.println(tesla.verDetalle());

        System.out.println(Automovil.calcularConsumoEstatico(300,65));

        System.out.println("Velocidad maxima carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad maxima ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD);

        System.out.println(Automovil.getColorPatente().getColor());

        System.out.println(mazda.calcularConsumo(300,70));
    }
}
