public class Coche {

    private String color;
    private String marca;
    
    public Coche(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coche{");
        sb.append("color=").append(color);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
}
