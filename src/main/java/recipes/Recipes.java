package recipes;

import recipes.dao.DbConnection;
import java.sql.Connection;

@SuppressWarnings("unused")
public class Recipes {

	public static void main(String[] args) {
	DbConnection.getConnection();

	}

}
