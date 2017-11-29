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
import model.Colmenitas;

import util.DbUtil;

public class ColmenitasDAO {
    
    private Connection connection;

    public ColmenitasDAO() throws URISyntaxException {
        connection = DbUtil.getConnection();
    }

    

    public ArrayList<Colmenitas> getAllColmenitass() throws SQLException, URISyntaxException {
        ArrayList<Colmenitas> colmenitas = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from colmena");
        while (rs.next()) {
            Colmenitas colmena = new Colmenitas();
            colmena.setIdColmena(rs.getInt("idColmena"));
            colmena.setUbicacion(rs.getString("ubicacion"));
            colmena.setFabrica(rs.getString("fabrica"));
            colmenitas.add(colmena);
        }
        return colmenitas;
    }

    
}
