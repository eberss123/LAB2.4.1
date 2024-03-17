
package Taller;

import cuerpoHumano.humanBody;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Que programa desea utilizar?");
        System.out.println("Caso 1: Bicicleta (ingrese '1')");
        System.out.println("Caso 2: Cuerpo humano (ingrese '2')");

        Scanner lectura = new Scanner(System.in);
        String opcion = lectura.nextLine();

        switch (opcion) {
            case "1" -> {
                // Programa de la bicicleta
                Bicicleta bici1 = new Bicicleta();
                System.out.println("Ingrese la marca de bicicleta que desea obtener:");
                String marca = lectura.nextLine();
                bici1.setMarca(marca);
                System.out.println("Ingrese el modelo que desea obtener:");
                String modelo = lectura.nextLine();
                bici1.setModelo(modelo);
                System.out.println("Ingrese el numero de marchas que desea obtener:");
                int marchas = lectura.nextInt();
                bici1.setNumeroMarchas(marchas);
                lectura.nextLine();
                System.out.println("Se ha creado una bicicleta:");
                System.out.println("Marca: " + bici1.getMarca());
                System.out.println("Modelo: " + bici1.getModelo());
                System.out.println("Numero de marchas: " + bici1.getNumeroMarchas());
                System.out.println("¿Desea agregar un cuadro personalizado? (si/no)");
                String respuesta1 = lectura.nextLine();
                if (respuesta1.equalsIgnoreCase("si")) {
                    System.out.println("Que color de cuadro desea?");
                    String color = lectura.nextLine();
                    bici1.cuadro1.setColor(color);
                }
                else {
                    System.out.println("De acuerdo, no hay problema.");
                }   System.out.println("¿Desea unas ruedas personalizadas? (si/no)");
                String respuesta2 = lectura.nextLine();
                if (respuesta2.equalsIgnoreCase("si") && respuesta1.equalsIgnoreCase("si")) {
                    System.out.println("Que tipo de llanta desea?");
                    String llanta = lectura.nextLine();
                    bici1.rueda1.setTipoLlanta(llanta);
                    System.out.println("Estos son tus datos con el cuadro y ruedas personalizados:\n");
                    System.out.println("Color de cuadro: " + bici1.getCuadro1().getColor());
                    System.out.println("Tipo de llanta: " + bici1.getRueda1().getTipoLlanta());
                    
                } else if (respuesta1.equalsIgnoreCase("si") && respuesta2.equalsIgnoreCase("no")) {
                    System.out.println("Estos son tus datos con el cuadro personalizado:\n");
                    System.out.println("Color de cuadro: " + bici1.getCuadro1().getColor());
                    
                } else if (respuesta1.equalsIgnoreCase("no") && respuesta2.equalsIgnoreCase("si")) {
                    System.out.println("¿Qué tipo de llanta desea?");
                    String llanta = lectura.nextLine();
                    bici1.rueda1.setTipoLlanta(llanta);
                    System.out.println("Estos son tus datos con las ruedas personalizadas:\n");
                    System.out.println("Tipo de llanta: " + bici1.getRueda1().getTipoLlanta());
                }
                else {
                    System.out.println("Que tengas buen dia.");
                }
            }
            case "2" -> {
                humanBody humano = new humanBody();
                System.out.println("bienvenido al registro de pacientes del hospital\n");
                System.out.println("que tipo de sangre tiene el paciente?");
                String sangre= lectura.nextLine();
                humano.setTipoSangre(sangre);
                System.out.println("que sexo es?");
                String sexo= lectura.nextLine();
                humano.setSexo(sexo);
                System.out.println("cuanta elasticidad pulmonar tiene el pulmon?");
                int elast = lectura.nextInt();
                lectura.nextLine();
                humano.pulmon.setElasticidadPulmonar(elast);
                System.out.println("cuantas enzimas tiene el higado?");
                int enzima = lectura.nextInt();
                lectura.nextLine();
                humano.higado.setEnzimas(enzima);
                System.out.println("cuanto ritmo cardiaco tiene el corazon?");
                int rit = lectura.nextInt();
                lectura.nextLine();
                humano.corazon.setRitmoCardiaco(rit);
                System.out.println("cuanto peso tiene el apendice(kg)?");
                int apen = lectura.nextInt();
                lectura.nextLine();
                humano.apendice.setPeso(apen);
                System.out.println("\nLos datos del paciente son:");
                System.out.println("Tipo de sangre: " + humano.getTipoSangre());
                System.out.println("Sexo: " + humano.getSexo());
                System.out.println("Elasticidad pulmonar: " + humano.pulmon.getElasticidadPulmonar());
                System.out.println("Enzimas del higado: " + humano.higado.getEnzimas());
                System.out.println("Ritmo cardiaco: " + humano.corazon.getRitmoCardiaco());
                System.out.println("Peso del apendice: " + humano.getApendice().getPeso() + " kg");
                
              
                
                
            }
            default -> System.out.println("Opcion no valida. Por favor, ingrese '1' o '2'.");
        }
    }
}
