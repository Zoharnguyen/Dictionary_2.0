package dao;

import java.sql.Statement;
import model.Dictionary;

public class ExecuteDatabase {

    static AcessDatabase acessDatabase = new AcessDatabase();
    static NextId maxId = new NextId();

    public boolean deleteElement(String word) {
        try {
            word = "'" + word + "'";
            Statement stmt = acessDatabase.collectionDatabase().createStatement();
            stmt.executeUpdate("delete from tbl_edict where word = " + word);
            stmt.close();
            acessDatabase.collectionDatabase().close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean updateElement(String word, String detail) {
        try {
            Statement stmt = acessDatabase.collectionDatabase().createStatement();
            String word1 = "'" + word + "'";
            String detail1 = "'" + detail + "'";
            stmt.executeUpdate("update tbl_edict set detail = " + detail1 + " where word = " + word1);
            stmt.close();
            acessDatabase.collectionDatabase().close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean insertElement(Dictionary dictionary) {
        try {
            Statement stmt = acessDatabase.collectionDatabase().createStatement();
            String word = "'" + dictionary.getWord() + "'";
            String detail = "'" + dictionary.getDetail() + "'";
            String id = maxId.maxId();
            stmt.executeUpdate("insert into tbl_edict values (" + id + "," + word + "," + detail + ")");
            stmt.close();
            acessDatabase.collectionDatabase().close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
