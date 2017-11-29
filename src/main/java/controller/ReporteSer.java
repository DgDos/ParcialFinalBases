package controller;

import dao.ColmenaDAO;
import dao.ColmenitasDAO;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Colmena;
import model.Colmenitas;
import util.Union;

public class ReporteSer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ColmenaDAO c1= new ColmenaDAO();
            ColmenitasDAO c2= new ColmenitasDAO();
            ArrayList<Colmena> colmenas1= c1.getAllColmenas();
            ArrayList<Colmenitas> colmenas2= c2.getAllColmenitass();
            ArrayList<Union> union=new ArrayList();
            for(Colmena colmena: colmenas1){
                for(Colmenitas colmenita:colmenas2){
                    if(colmenita.getIdColmena()==colmena.getIdColmenaMadre()){
                        Union u=new Union(colmena.getIdColmena(), colmena.getUbicacion(), colmena.getFabrica(), colmena.getTotalKilos(), colmena.getIdColmenaMadre(), colmenita.getUbicacion(), colmenita.getFabrica());
                        union.add(u);
                    }
                }
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/union.jsp");
            request.setAttribute("respuesta", union);
            rd.forward(request, response);
        } catch (URISyntaxException ex) {
            Logger.getLogger(ReporteSer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReporteSer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       
    }

}