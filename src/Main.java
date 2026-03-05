import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int m= 0;
        int o= 0;
        int m20= 0, m50 = 0, m100=0, m200=0, m500=0, m1000=0;
        int t20= 0, t50 = 0, t100=0, t200=0, t500=0, t1000=0;
        int nm= 0;
        int total;
        int a=0;
        int meta= 0;
        System.out.println("Escriba la meta a la que desea llegar");
        meta = lector.nextInt();

        while (a==0){

        System.out.println("""
                Seleccione el numero de una de estas opciones:
                1. Ahorrar
                2. Contar Monedas
                3. Valor acumulado
                4. Total Dinero
                5. Meta ahorro""");

        o= lector.nextInt();

        switch (o) {
            case 1:
                o = Integer.parseInt("1");
                System.out.println("Seleccione el numero de la opcion la moneda que quiere ingresar");
                System.out.println("""
                        Monedas
                        1.20
                        2.50
                        3.100
                        4.200
                        5.500
                        6.1000
                        """);
                m = lector.nextInt();

                switch (m) {
                    case 1:
                        m = Integer.parseInt("1");
                        System.out.println("Se sumo al total una moneda de 20");
                        m20 = m20 + 1;
                        break;
                    case 2:
                        m = Integer.parseInt("2");
                        System.out.println("Se sumo al total una moneda de 50");
                        m50 = m50 + 1;
                        break;
                    case 3:
                        m = Integer.parseInt("3");
                        System.out.println("Se sumo al total una moneda de 100");
                        m100 = m1000 + 1;
                        break;
                    case 4:
                        m = Integer.parseInt("4");
                        System.out.println("Se sumo al total una moneda de 200");
                        m200 = m200 + 1;
                        break;
                    case 5:
                        m = Integer.parseInt("5");
                        System.out.println("Se sumo al total una moneda de 500");
                        m500 = m500 + 1;
                        break;
                    case 6:
                        m = Integer.parseInt("6");
                        System.out.println("Se sumo al total una moneda de 1000");
                        m1000 = m1000 + 1;
                        break;
                }
                break;


            case 2:
                o = Integer.parseInt("2");
                System.out.println("Seleccione el numero de la opcion del cual quiere ver cuantas monedas hay");
                System.out.println("""
                        1.Monedas de 20
                        2.Monedas de 50
                        3.Monedas de 100
                        4.Monedas de 200
                        5.Monedas de 500
                        6.Monedas de 1000
                        """);
                nm = lector.nextInt();
                switch (nm) {
                    case 1:
                        nm = Integer.parseInt("1");
                        System.out.println("Tiene " + m20 + " monedas de 20");
                    case 2:
                        nm = Integer.parseInt("2");
                        System.out.println("Tiene " + m50 + " monedas de 50");
                    case 3:
                        nm = Integer.parseInt("3");
                        System.out.println("Tiene " + m100 + " monedas de 100");
                    case 4:
                        nm = Integer.parseInt("4");
                        System.out.println("Tiene " + m200 + " monedas de 200");
                    case 5:
                        nm = Integer.parseInt("5");
                        System.out.println("Tiene " + m500 + " monedas de 500");
                    case 6:
                        nm = Integer.parseInt("6");
                        System.out.println("Tiene " + m1000 + " monedas de 1000");
                        break;
                }
                break;
            case 3:
                o = Integer.parseInt("3");
                t20=m20*20;
                System.out.println("El valor absoluto acumulado de las monedas de 20 es: " + t20);
                t50=m50*50;
                System.out.println("El valor absoluto acumulado de las monedas de 50 es: " + t50);
                t100=m100*100;
                System.out.println("El valor absoluto acumulado de las monedas de 100 es: " + t100);
                t200=m200*200;
                System.out.println("El valor absoluto acumulado de las monedas de 200 es: " + t200);
                t500=m500*500;
                System.out.println("El valor absoluto acumulado de las monedas de 500 es: " + t500);
                t1000=m1000*1000;
                System.out.println("El valor absoluto acumulado de las monedas de 1000 es: " + t1000);

                break;
            case 4:
                o = Integer.parseInt("4");
                t20=m20*20;
                t50=m50*50;
                t100=m100*100;
                t200=m200*200;
                t500=m500*500;
                t1000=m1000*1000;
                total = t20 + t50 + t100 + t200 + t500 +t1000;
                        System.out.println("El total del dinero es: " + total);
                        break;
            case 5:
                o = Integer.parseInt("5");

                t20=m20*20;
                t50=m50*50;
                t100=m100*100;
                t200=m200*200;
                t500=m500*500;
                t1000=m1000*1000;
                total = t20 + t50 + t100 + t200 + t500 +t1000;


                if (meta>total){
                    System.out.println("Lleva ahorrado: " + total);
                }
                if (meta<=total){
                    System.out.println("¡¡Ya cumplio su meta felicidades!!");
                }
                break;






        }
        }

    }
}