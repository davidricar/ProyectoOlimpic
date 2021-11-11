
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import GestorBD.*;

public class mainBD {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBManager miManager = new DBManager("Mibase.db");
		
		miManager.createNewDatabase("MiBase.db");
		miManager.createLink();
		
		miManager.createNewTableDeporte();

		miManager.insertTableDeporte("DDDD","Femenino");
		
		miManager.createNewTablePais();
		miManager.insertTablePais("ESP");
		
		miManager.createNewTableDeportista();
		miManager.insertTableDeportista("Fernando", "masculino", 25,0005);

		miManager.insertTableDeporte("AAAA","Femenino");
		
		miManager.createNewTableDeportista();
		miManager.insertTableDeportista("Carla", "femenino", 21,0001);

		miManager.closeLink();


		//miManager.createNewDatabase("Mibases.db");
		
		

}

}
