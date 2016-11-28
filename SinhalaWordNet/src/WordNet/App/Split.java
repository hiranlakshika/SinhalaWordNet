package WordNet.App;

import WordNet.Database.DBConnection;

import java.sql.*;

/**
 * Created by hiran on 11/2/16.
 */
public class Split {


    private String s = "" ;

    String[] a;

    void spiltString() {
        if (s.contains(".")) {
            a = s.split("\\.");
        } else {
            a = s.split("\\r?\\n");
        }
    }

    private int id;

    private void getIdFromDb(){
        String sql = "SELECT * FROM  `sentence` WHERE id = (SELECT MAX( id ) FROM  `sentence` )";
        try {
            Connection connection = DBConnection.getConnection();
            Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()) {
                id = Integer.parseInt(rst.getString("id"));
            }
        }catch (SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    void print() {
        getIdFromDb();
        System.out.println(a.length);
        for (String j : a) {
            System.out.println(j + "\n");
            ++id;
            try {
                String sql = "Insert into sentence values(?,?)";
                Connection connection = DBConnection.getConnection();
                PreparedStatement stm = connection.prepareStatement(sql);
                if (j.length()>20){
                    stm.setObject(1, id);
                    stm.setObject(2, j);
                    int res = stm.executeUpdate();
                    if (res > 0) {
                        System.out.println("Added " + id);
                    }
                }
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }

    }

    public static void main(String[] args) {
        Split split = new Split();

        split.spiltString();
        split.print();
    }
}
