package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Dictionary;

public class AcessDatabase {

    public static Connection collectionDatabase() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:D://IT/Java/Project/DictionaryProject-master/database/dictionary.db");
        return con;
    }

    public static List<Dictionary> readDatabase() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        List<Dictionary> listDict = new ArrayList<>();
        Statement state = collectionDatabase().createStatement();
        String sql = "select * from tbl_edict;";
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()) {
            Dictionary dict = new Dictionary(rs.getInt(1), rs.getString(2), rs.getString(3));
            listDict.add(dict);
        }
        return listDict;
    }
}
