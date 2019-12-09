package hello;

public class ingresoMaterial {

    private final int codigo;
    private final int cantidad;
    private final String bodega;

    public ingresoMaterial(int codigo, int cantidad, String bodega) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.bodega = bodega;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getBodega() {
        return bodega;
    }
}