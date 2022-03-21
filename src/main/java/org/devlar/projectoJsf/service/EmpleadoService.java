/**
 * 
 */
package org.devlar.projectoJsf.service;

import java.util.ArrayList;
import java.util.List;

import org.devlar.projectoJsf.entity.EmpleadoEntity;

/**
 * @author DevLar
 *
 */
public class EmpleadoService {
	 
	public List<EmpleadoEntity> consultarEmpleado (){
		 List<EmpleadoEntity> empleados = new ArrayList<>();
		 
		 EmpleadoEntity telcel = new EmpleadoEntity();
		 telcel.setNombreEmpelado("Oscar");
		 telcel.setPrimerApellido("Lara");
		 telcel.setSegundoApellido("Patricio");
		
		 EmpleadoEntity unefon = new EmpleadoEntity();
		 unefon.setNombreEmpelado("Jaqueline");
		 unefon.setPrimerApellido("Lara");
		 unefon.setSegundoApellido("Patricio");


		 EmpleadoEntity movistar = new EmpleadoEntity();
		 movistar.setNombreEmpelado("Monserrat");
		 movistar.setPrimerApellido("Lara");
		 movistar.setSegundoApellido("Patricio");
		 
		 empleados.add(telcel);
		 empleados.add(unefon);
		 empleados.add(movistar);
		 
		 return empleados;
	}
	
}
