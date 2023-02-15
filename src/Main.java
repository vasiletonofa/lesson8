import office.Angajat;
import office.Companie;

public class Main {

    public static void main(String [] args) {

//        int array[][] = {{1,2,3}, {3, 4, 5}, {6,7,8}};
//
//        int media;
//        int suma = 0;
//        int count = 0;
//
//        int pare = 0;
//        int impare = 0;
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//                count++;
//                suma = suma + array[i][j];
//
//                if (array[i][j] % 2 == 0) {
//                    pare++;
//                } else {
//                    impare++;
//                }
//            }
//
//            System.out.println();
//        }
//
//        media = suma / count;
//
//        System.out.println("Media: " + media);
//        System.out.println("Suma: " + suma);
//        System.out.println("Pare: " + pare);
//        System.out.println("Impare: " + impare);

        // Companie = Companie(Office[](Angajat[](salriu))))
        // Angajat 1 = 20000, Angajat 2 = 30000
        // Office[] { 50000 }
        // Companie(Office[] { Angajat 1 })

        Companie companie = new Companie();

        Angajat angajati[] = new Angajat[20];
        angajati[0] = new Angajat("Ion", 15000);
        angajati[1] = new Angajat("Vasile", 10000);

        companie.addNewOffice("Oficiul 1", "Back Office", angajati);

        Angajat angajati2[] = new Angajat[20];
        angajati2[0] = new Angajat("Mihai", 20000);
        angajati2[1] = new Angajat("Gheorghe", 30000);

        companie.addNewOffice("Oficiul 2", "IT Department", angajati2);

        System.out.println("Salariu mediu per angajat: " + companie.calculeazSalariuMediuAngajat());

    }
}