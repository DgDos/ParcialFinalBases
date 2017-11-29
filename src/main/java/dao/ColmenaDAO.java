package dao;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Colmena;

import util.DbUtil;

public class ColmenaDAO {
    
    private Connection connection;

    public ColmenaDAO() throws URISyntaxException {
        connection = DbUtil.getConnection();
    }

    

    public ArrayList<Colmena> getAllColmenas() throws SQLException {
        ArrayList<Colmena> colmenas = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from colmena");
        while (rs.next()) {
            Colmena colmena = new Colmena();
            colmena.setIdColmena(rs.getInt("idColmena"));
            colmenas.add(colmena);
        }
        return colmenas;
    }

    
}
