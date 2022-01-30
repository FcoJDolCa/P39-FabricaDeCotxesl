public class Coche {

    private String matricula;
    private String marca;
    private String model;
    private String color;
    private boolean sostreSolar;
    private int km;
    private int numPuertas;
    private int numPlazas;

    public Coche(String matricula, String marca, String model, String color,
                 boolean sostreSolar, int km, int numPuertas, int numPlazas) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.color = color;
        this.sostreSolar = sostreSolar;
        this.km = km;
        this.numPuertas = numPuertas;
        this.numPlazas = numPlazas;
    }

   /* public Coche() {

    }*/

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean getSostreSolar() {
        return sostreSolar;
    }
    public void setSostreSolar(boolean sostreSolar) {
        this.sostreSolar = sostreSolar;
    }

    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }
    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }





}
