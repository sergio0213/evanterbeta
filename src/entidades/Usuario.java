package entidades;

import java.util.Date;

public class Usuario {
	private String usuario;
	private String nombre;
	private String contrasenia;
	private int dias;
	private Date fechacreacion;
	private int estado;
	private char tipo;
	private String cargo;
	
	public Usuario() {
	}
		
	public Usuario(String nombre, String contrasenia) {
		super();
		this.nombre = nombre;
		this.contrasenia = contrasenia;
	}

	public Usuario(String usuario) {
		super();
		this.usuario = usuario;
	}
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public Date getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}
	
	
	
}
