public class Satelites extends Astros {

    private double distanciaAlPlaneta;
    private double orbitaPlanetaria;
    private String planetaAlQuePertenece;
    
    public Satelites(double distanciaAlPlaneta, double orbitaPlanetaria, String planetaAlQuePertenece, double radioEcuatorial, double rotacionSobreEje,
    double masa, double temperatura, double gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionSobreEje = rotacionSobreEje;
        this.masa = masa;
        this.temperatura = temperatura;
        this.gravedad = gravedad;
        this.distanciaAlPlaneta = distanciaAlPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaAlQuePertenece = planetaAlQuePertenece;
    }

    public double getDistanciaAlPlaneta() {
        return distanciaAlPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public String getPlanetaAlQuePertenece() {
        return planetaAlQuePertenece;
    }

    @Override
    public String toString() {
        return "Satelites [radioEcuatorial=" + radioEcuatorial + ", distanciaAlPlaneta=" + distanciaAlPlaneta
                + ", rotacionSobreEje=" + rotacionSobreEje + ", orbitaPlanetaria=" + orbitaPlanetaria + ", masa=" + masa
                + ", planetaAlQuePertenece=" + planetaAlQuePertenece + ", temperatura=" + temperatura + ", gravedad="
                + gravedad + "]";
    }

   
    

}
