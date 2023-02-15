package office;

public class Angajat {
    private int salariu;
    private String nume;

    public Angajat(String nume, int salariu) {
        this.salariu = salariu;
        this.nume = nume;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
}
