package office;

class Office {
    private int numarDeAngajati;
    private int sumaSalarii;
    private String descriere;
    private String nume;

    private Angajat[] angajati = new Angajat[300];

    public int getNumarDeAngajati() {
        return numarDeAngajati;
    }

    public void setNumarDeAngajati(int numarDeAngajati) {
        this.numarDeAngajati = numarDeAngajati;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSumaSalarii() {
        for (int i = 0; i < numarDeAngajati; i++) {
            sumaSalarii = sumaSalarii + angajati[i].getSalariu();
        }

        return sumaSalarii;
    }

    public void setSumaSalarii(int sumaSalarii) {
        this.sumaSalarii = sumaSalarii;
    }

    public Angajat[] getAngajati() {
        return angajati;
    }

    public void setAngajati(Angajat[] angajati) {
        this.angajati = angajati;
    }
}
