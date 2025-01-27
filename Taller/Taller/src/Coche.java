public class Coche {

    private String color;
    private String marca;
    private String matricula;
    
    public Coche(String color, String marca, String matricula) {
        this.color = color;
        this.marca = marca;
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coche{");
        sb.append("color=").append(color);
        sb.append(", marca=").append(marca);
        sb.append(", matricula=").append(matricula);
        sb.append('}');
        return sb.toString();
    }
}
