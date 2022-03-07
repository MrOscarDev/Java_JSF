/**
 * 
 */
package org.devlar.projectoJsf.controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author DevLar
 *
 */
@ManagedBean
public class Controller {

	private String name;
	private String pass;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/* Metodos */
	public void ingresar() {
		/*
		 * facesContext es para poder realizar una accion/ y poder crear un mensaje por
		 * medio de una instancia
		 */
		if (name.equals("oscar") && pass.equals("12345")) {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUser",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Correcto", ""));
			System.out.println("nombre: " + name);
			
			// Caundo llamo el metodo me pedira un try catch ya que de esat forma se vera si no esta que me mande un mensaje.
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtPass",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Password &/o usuairo incorrecto", ""));
		}
	}
	
	
	/*
	 *Creo el metodo el cual me redireccionara a otra pagina en privado de tipo String , por que una pagina es String 
	 *se usar el ExternalContext ya que se trabajara con objetos externos en este caso la pagina a redireccionar
	 * se agrega un nombre, se crea un faces context el cual obtednra una instancia externda y al final se le pasa a ese objet
	 * la pagina pero nos pedira ua validacion ya que si no se encuetra la pagina tiene que poner una excepcion en este caso se usa
	 * el IOException
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

}
