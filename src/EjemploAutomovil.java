import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil tesla = new Automovil("tesla","plaid",Color.NEGRO,new Motor(0,TipoMotor.ELECTRICO),new Estanque(100));
        Automovil mazda = new Automovil("mazda","sport",Color.ROJO,new Motor(2.5,TipoMotor.BENCINA),new Estanque(80));
        Automovil navara = new Automovil("nissan","navara",Color.BLANCO,new Motor(3,TipoMotor.DIESEL),new Estanque(90));
        Automovil navara2 = new Automovil("nissan","navara",Color.AZUL,new Motor(3,TipoMotor.BENCINA),new Estanque(70));

        System.out.println((navara.equals(navara2)? "son iguales":"no son iguales"));

        Automovil automovil = new Automovil();

        Date fecha =  new Date();
        System.out.println(automovil.equals(fecha));

        System.out.println((navara.equals(automovil)? "son iguales":"no son iguales"));

        Automovil ford = new Automovil();

        System.out.println(tesla.acelerar(150));
        System.out.println(tesla.frenar());
        System.out.println(tesla.acelerarFrenar());

        System.out.println("Kilometros por litro: "+tesla.calcularConsumo(300,0.75f));
        System.out.println("Kilometros por litro: "+mazda.calcularConsumo(300,75));
        System.out.println("Kilometros por litro: "+navara.calcularConsumo(300,80));

        System.out.println(navara.toString());

    }
}
