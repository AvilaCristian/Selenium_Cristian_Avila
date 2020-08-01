import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaSoft {

    public static void main (String args[]){
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        Scanner input = new Scanner(System.in);

        int opcion = 0;
        JavaUtils.bienvenida();

        while (opcion != 4){
            System.out.println("1- Ingresar Tester");
            System.out.println("2- Ingresar Desarrollador");
            System.out.println("3- Ver Empleados");
            System.out.println("4- Salir");
            opcion = input.nextInt();

            if (opcion == 1) {
                String nombre = JavaUtils.ingresarPalabra("Ingrese el nombre del tester");
                int año = JavaUtils.ingresarNumero("Ingrese su año de nacimiento");

                int edad = Constants.AÑO_ACTUAL - año;

                Empleado tester = new Tester(nombre, 1234123, 123412,true, false);

                listaEmpleados.add(tester);

            } else if (opcion == 2) {
                String nombre = JavaUtils.ingresarPalabra("Ingrese el nombre del dev");

                Empleado dev = new Developer(nombre,123123,199999,"Phyton");
                listaEmpleados.add(dev);

            } else if (opcion == 3) {
                ArrayListUtils.imprimirEmpleados(listaEmpleados);

            } else {
                JavaUtils.finalizarPrograma();
            }

        }

/*
        System.out.println("Ingese su nombre....");
        String nombre = input.nextLine();

        System.out.println("Ingrese 1 si es tester manual, o 0 si no lo es");
        opcion = input.nextInt();

        boolean esTesterManual;
        if (opcion == 1) {
            esTesterManual = true;
        } else {
            esTesterManual = false;
        }

        System.out.println("Ingrese 1 si es tester automatizador, o 0 si no lo es");
        int opcionAutomatizador = input.nextInt();

        boolean esTesterAutomatizador;
        if (opcionAutomatizador == 1) {
            esTesterAutomatizador = true;
        } else {
            esTesterAutomatizador = false;
        }

        Empleado t1 = new Tester(nombre, 12341234, 10000, esTesterManual, esTesterAutomatizador);

        Empleado t2 = new Developer("Ana",44444, 12222,"Java");





        //listaEmpleados.add(t1);
        //listaEmpleados.add(t2);
        imprimirEmpleados(listaEmpleados);*/
    }





}
