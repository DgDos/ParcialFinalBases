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
        ResultSet rs = statement.executeQuery("SELECT colmena.idcolmena,colmena.ubicacion, colmena.fabrica, colmena.idcolmenamadre, SUM(recoleccion.kilos) as totalKilos from recoleccion,colmena where recoleccion.idtrabajador!=123456 and recoleccion.idcolmena=colmena.idcolmena group by colmena.idcolmena having SUM(recoleccion.kilos)>2");
        while (rs.next()) {
            Colmena colmena = new Colmena();
            colmena.setIdColmena(rs.getInt("idcolmena"));
            colmena.setUbicacion(rs.getString("ubicacion"));
            colmena.setFabrica(rs.getString("fabrica"));
            colmena.setIdColmenaMadre(rs.getInt("idcolmenamadre"));
            colmena.setTotalKilos(rs.getInt("totalkilos"));
            colmenas.add(colmena);
        }
        return colmenas;
    }

    
}
