package perimetras2;

import java.util.Scanner;

public class Perimetras2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Iveskite tasko A x koordinate:");
        int taskasAx = sc.nextInt();

        System.out.println("Iveskite tasko A y koordinate:");
        int taskasAy = sc.nextInt();
      
        System.out.println("Iveskite tasko B x koordinate:");
        int taskasBx = sc.nextInt();

        System.out.println("Iveskite tasko B y koordinate:");
        int taskasBy = sc.nextInt();
      
        System.out.println("Iveskite tasko C x koordinate:");
        int taskasCx = sc.nextInt();

        System.out.println("Iveskite tasko C y koordinate:");
        int taskasCy = sc.nextInt();
        
        double lengthAB = Math.sqrt(((taskasBx - taskasAx) * (taskasBx - taskasAx)) + ((taskasBy - taskasAy) * (taskasBy - taskasAy)));  
        System.out.println("AB krastines ilgis: " + lengthAB);
        
        double lengthBC = Math.sqrt(((taskasBx - taskasCx) * (taskasBx - taskasCx)) + ((taskasBy - taskasCy) * (taskasBy - taskasCy)));  
        System.out.println("BC krastines ilgis: " + lengthBC);
          
        double lengthAC = Math.sqrt(((taskasCx - taskasAx) * (taskasCx - taskasAx)) + ((taskasCy - taskasAy) * (taskasCy - taskasAy)));  
        System.out.println("AC krastines ilgis: " + lengthAC);
        
        double perimetras = lengthAB + lengthBC + lengthAC;
        System.out.println("Trikampio perimetras: " + perimetras);
        
//        int[] taskasA = new int[2];
//        System.out.println("Iveskite tasko A (x; y) koordinates: ");
//        for (int i = 0; i < 2; i++) {
//            taskasA[i] = sc.nextInt();
//        }
//
//        int[] taskasB = new int[2];
//        System.out.println("Iveskite tasko B (x; y) koordinates: ");
//        for (int i = 0; i < 2; i++) {
//            taskasB[i] = sc.nextInt();
//        }
//
//        int[] taskasC = new int[2];
//        System.out.println("Iveskite tasko C (x; y) koordinates: ");
//        for (int i = 0; i < 2; i++) {
//            taskasC[i] = sc.nextInt();
//        }
//
//        double lengthAB = Math.sqrt(((taskasB[0] - taskasA[0]) * (taskasB[0] - taskasA[0])) + ((taskasB[1] - taskasA[1]) * (taskasB[1] - taskasA[1])));
//        System.out.println("AB krastines ilgis: " + lengthAB);
//
//        double lengthBC = Math.sqrt(((taskasB[0] - taskasC[0]) * (taskasB[0] - taskasC[0])) + ((taskasB[1] - taskasC[1]) * (taskasB[1] - taskasC[1])));
//        System.out.println("BC krastines ilgis: " + lengthBC);
//
//        double lengthAC = Math.sqrt(((taskasC[0] - taskasA[0]) * (taskasC[0] - taskasA[0])) + ((taskasC[1] - taskasA[1]) * (taskasC[1] - taskasA[1])));
//        System.out.println("AC krastines ilgis: " + lengthAC);
//
//        double perimetras = lengthAB + lengthBC + lengthAC;
//        System.out.println("Trikampio perimetras: " + perimetras);
//    }

}
