/**
 * 
 */
package org.devlar.projectoJsf.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;

import org.devlar.projectoJsf.entity.EmpleadoEntity;
import org.devlar.projectoJsf.service.EmpleadoService;

/**
 * @author DevLar
 *
 */

@javax.faces.bean.ManagedBean
@ViewScoped
public class EmpleadoController {
	private List<EmpleadoEntity> employes;
	private EmpleadoService empleadoService = new EmpleadoService();
	
	
	
	public void consultarEmpleado () {
		this.employes = this.empleadoService.consultarEmpleado();
	}

	@PostConstruct
	public void init() {
		this.consultarEmpleado();
	}
	
	
	/**
	 * @return the employes
	 */
	public List<EmpleadoEntity> getEmployes() {
		return employes;
	}

	/**
	 * @param employes the employes to set
	 */
	public void setEmployes(List<EmpleadoEntity> employes) {
		this.employes = employes;
	}
	
	

}
