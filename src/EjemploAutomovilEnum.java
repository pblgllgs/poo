public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setEstanqueEstatico(35);

        Automovil tesla = new Automovil("tesla", "plaid", Color.NEGRO, new Motor(0,TipoMotor.ELECTRICO), new Estanque(100));
        tesla.setTipo(TipoAutomovil.HATCHBACK);

        TipoAutomovil tipo = tesla.getTipo();
        System.out.println("tipo tesla: " + tipo.getNombre());
        System.out.println("descripción: " + tipo.getDescripcion());

        tesla.setTipo(TipoAutomovil.CONVERTIBLE);
        tipo = tesla.getTipo();

        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El auto es deportivo y descapotable");
            case COUPE -> System.out.println("El auto es pequeño y dos puertas");
            case FURGON -> System.out.println("El auto es utilitario de transporte");
            case HATCHBACK -> System.out.println("El auto es rápido y semi deportivo");
            case SEDAN -> System.out.println("El auto es normal familiar");
            case PICK_UP -> System.out.println("camioneta todo terreno");
            case STATION_WAGON -> System.out.println("El auto es familiar");
        }

        TipoAutomovil [] tipos =  TipoAutomovil.values();

        for (TipoAutomovil tipoAutomovil : tipos){
            System.out.println("Nombre: "+ tipoAutomovil.getNombre() +
                    " -> Descripción: "+ tipoAutomovil.getDescripcion()+
                    ", Nro. puertas: "+ tipoAutomovil.getNumeroPuertas());
        }
    }
}
