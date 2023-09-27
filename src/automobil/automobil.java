package automobil;

public class automobil {
    public int anProducere;
    public String model;
    public String marca;
public int getAnProducere() {
    return anProducere;
}
    public String getModel() {
        return model;
    }
    public String getMarca() {
        return marca;
    }

    public void printVariables() {
        System.out.println("Marca:" + marca);
        System.out.println("Model:" + model);
        System.out.println("Anul producerii:" + anProducere);
    }
}
