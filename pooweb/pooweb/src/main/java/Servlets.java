import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import figuras.Cilindro;
import figuras.Circulo;
import figuras.Cono; 
import figuras.Triangulo;

public class Servlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al servlet");
        String action = req.getParameter("action");
        System.out.println(action);

        switch (action) {
            case "triangulo":
                req.getRequestDispatcher("selecT.jsp").forward(req, resp);
                break;

            case "circulo":
                req.getRequestDispatcher("selecCi.jsp").forward(req, resp);
                break;

            case "cono":
                req.getRequestDispatcher("selecCo.jsp").forward(req, resp);
                break;

            case "cilindro":
                req.getRequestDispatcher("selecCil.jsp").forward(req, resp);
                break;

            case "index":
                req.getRequestDispatcher("index.jsp").forward(req, resp);
                break;

            case "perimetro1":
                req.getRequestDispatcher("triangulo2.jsp").forward(req, resp);
                break;

            case "area1":
                req.getRequestDispatcher("triangulo.jsp").forward(req, resp);
                break;

            case "perimetro2":
                req.getRequestDispatcher("cono2.jsp").forward(req, resp);
                break;

            case "area2":
                req.getRequestDispatcher("cono.jsp").forward(req, resp);
                break;

            case "perimetro3":
                req.getRequestDispatcher("circulo2.jsp").forward(req, resp);
                break;

            case "area3":
                req.getRequestDispatcher("circulo.jsp").forward(req, resp);
                break;

            case "perimetro4":
                req.getRequestDispatcher("cilindro2.jsp").forward(req, resp);
                break;

            case "area4":
                req.getRequestDispatcher("cilindro.jsp").forward(req, resp);
                break;

            default:
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");

        switch (action) {
            case "areat":
            Double base=Double.parseDouble(req.getParameter("Base"));
            Double altura=Double.parseDouble(req.getParameter("Altura"));
                Triangulo tri=new Triangulo(base, altura,0.0, 0.0);

                req.setAttribute("area", tri.calcularArea());
                req.getRequestDispatcher("area.jsp").forward(req, resp);
                break;

            case "perit":
            Double baset=Double.parseDouble(req.getParameter("Base"));
            Double ladoAt= Double.parseDouble(req.getParameter("LadoA"));
            Double ladoBt= Double.parseDouble(req.getParameter("LadoB"));
            Triangulo trian=new Triangulo(baset, 0.0, ladoAt, ladoBt);
                req.setAttribute("perimetro", trian.calcularPerimetro());
                req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
                break;

            case "areaco":
            int radio=Integer.parseInt(req.getParameter("radio"));
            int alturac=Integer.parseInt(req.getParameter("altura"));
                Cono co=new Cono(radio, 3.1416, alturac);

                req.setAttribute("area", co.calcularArea());
                req.setAttribute("perimetro", co.calcularPerimetro());
                req.getRequestDispatcher("area.jsp").forward(req, resp);
                break;
            case "perico":
            int radioc=Integer.parseInt(req.getParameter("radio"));
            int alturaco=Integer.parseInt(req.getParameter("altura"));
                Cono con=new Cono(radioc, 3.1416, alturaco);

                req.setAttribute("perimetro", con.calcularPerimetro());
                req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
                break;

            case "areacir":
            int radioci=Integer.parseInt(req.getParameter("radio"));
            
                Circulo cir=new Circulo(3.1416,radioci);

                req.setAttribute("area", cir.calcularArea());
                req.getRequestDispatcher("area.jsp").forward(req, resp);
                break;
            case "pericir":
            int radiocir=Integer.parseInt(req.getParameter("radio"));
            
                Circulo circu=new Circulo(3.1416,radiocir);

                req.setAttribute("perimetro", circu.calcularPerimetro());
                req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
                break;

            case "areacil":
            int radiocil=Integer.parseInt(req.getParameter("radio"));
            int alturaci=Integer.parseInt(req.getParameter("altura"));

                Cilindro cil=new Cilindro(3.1416,radiocil, alturaci);

                req.setAttribute("area", cil.calcularArea());
                req.getRequestDispatcher("area.jsp").forward(req, resp);
                break;
            case "pericil":
            int radiocili=Integer.parseInt(req.getParameter("radio"));
            int alturacili=Integer.parseInt(req.getParameter("altura"));

                Cilindro cili=new Cilindro(3.1416,radiocili, alturacili);

                req.setAttribute("perimetro", cili.calcularPerimetro());
                req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
                break;

            default:
                break;
        }
    }

}
