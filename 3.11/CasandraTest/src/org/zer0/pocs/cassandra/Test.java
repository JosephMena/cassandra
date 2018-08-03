package org.zer0.pocs.cassandra;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class Test {

	public static void main(String[] args) {
		Test t=new Test();
		t.realizarConsultaPersona();
	}
	
	private void realizarConsultaPersona() {
		String consulta="select * from personas.persona";
		
		Session sesion=conectar();
		ResultSet rs=sesion.execute(consulta);
		rs.forEach(row->{
			System.out.println(row.getString("nombres"));
		});
	}
	
	public Session conectar() {
		Conexion cliente = new Conexion();
		cliente.connect("127.0.0.1", 9042);
		return cliente.getSession();
	}

}
