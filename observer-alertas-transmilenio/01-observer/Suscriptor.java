// Paso 1: el contrato que cumple cualquier canal que quiera enterarse
public interface Suscriptor {
    void actualizar(Novedad novedad);
}
