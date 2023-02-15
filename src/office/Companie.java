package office;

public class Companie {

    private int mediaSalariuAngajat;
    private Office offices[] = new Office[30];
    private int numarOficii = 0;

    public int calculeazSalariuMediuAngajat() {
        int suma = 0;
        int numarAngajati = 0;
        for (int i = 0; i < calculeazaNumarOficii(); i++) {
            suma = suma + offices[i].getSumaSalarii();
            numarAngajati = numarAngajati + offices[i].getNumarDeAngajati();
        }

        mediaSalariuAngajat = suma / numarAngajati;

        return mediaSalariuAngajat;
    }

    public void addNewOffice(String nume, String descriere, Angajat[] angajati) {
        int numarAngajatiOficiu = calculeazaNumarAngajati(angajati);

        Office office = new Office();
        office.setNume(nume);
        office.setDescriere(descriere);
        office.setNumarDeAngajati(numarAngajatiOficiu);
        office.setAngajati(angajati);
        offices[numarOficii] = office;
        numarOficii++;
    }

    private int calculeazaNumarAngajati(Angajat[] angajati) {
        int numarAngajatiOficiu = 0;
        for (int i = 0; i < angajati.length; i++) {
            if(angajati[i] != null) {
                numarAngajatiOficiu++;
            }
        }

        return numarAngajatiOficiu;
    }

    private int calculeazaNumarOficii() {
        int numarOficii = 0;
        for (int i = 0; i < offices.length; i++) {
            if(offices[i] != null) {
                numarOficii++;
            }
        }

        return numarOficii;
    }
}
