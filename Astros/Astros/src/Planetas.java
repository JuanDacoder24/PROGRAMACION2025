public class Planetas extends Astros {

    private double distanciaAlSol;
    private double orbitaAlSol;
    private boolean tieneSatelites;
    
    public Planetas(double distanciaAlSol, double orbitaAlSol, boolean tieneSatelites, double radioEcuatorial, double rotacionSobreEje,
    double masa, double temperatura, double gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionSobreEje = rotacionSobreEje;
        this.masa = masa;
        this.temperatura = temperatura;
        this.gravedad = gravedad;
        this.distanciaAlSol = distanciaAlSol;
        this.orbitaAlSol = orbitaAlSol;
        this.tieneSatelites = tieneSatelites;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public double getOrbitaAlSol() {
        return orbitaAlSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    @Override
    public String toString() {
        return "Planetas [radioEcuatorial=" + radioEcuatorial + ", distanciaAlSol=" + distanciaAlSol + ", orbitaAlSol="
                + orbitaAlSol + ", rotacionSobreEje=" + rotacionSobreEje + ", tieneSatelites=" + tieneSatelites
                + ", masa=" + masa + ", temperatura=" + temperatura + ", gravedad=" + gravedad + "]";
    }

    

    

}
