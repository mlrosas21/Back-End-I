package Clase5;

public class ServicioDescargaProxy implements IServicioDescarga {
    private ServicioDecarga servDescarga;
    private Usuario usuario;

    public ServicioDescargaProxy(ServicioDecarga servDescarga, Usuario usuario) {
        this.servDescarga = servDescarga;
        this.usuario = usuario;
    }

    public ServicioDecarga getServDescarga() {
        return servDescarga;
    }

    public void setServDescarga(ServicioDecarga servDescarga) {
        this.servDescarga = servDescarga;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String descargar() {
        if (getUsuario().getTipoUsuario().equalsIgnoreCase("Premium")) {
            return getServDescarga().descargar();
        } else if (getUsuario().getTipoUsuario().equalsIgnoreCase("free")) {
            return "No tenes servicio Premium";
        } else {
            return "Tipo de usuario inválido";
        }
    }
}

