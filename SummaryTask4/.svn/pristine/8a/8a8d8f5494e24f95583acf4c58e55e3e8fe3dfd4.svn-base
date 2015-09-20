package ua.nure.bratiuschenko.SummaryTask4.web.controllers;

import java.io.IOException;
import java.util.Date;
 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
/**
 * Servlet implementation class PdfController
 */
@WebServlet("/PdfController")
public class PdfController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PdfController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
		        throws ServletException, IOException {
		        response.setContentType("application/pdf");
		        try {
		            // step 1
		            Document document = new Document();
		            // step 2
		            PdfWriter.getInstance(document, response.getOutputStream());
		            // step 3
		            document.open();
		            // step 4
		            document.add(new Paragraph("Hello World"));
		            document.add(new Paragraph(new Date().toString()));
		            // step 5
		            document.close();
		        } catch (DocumentException de) {
		            throw new IOException(de.getMessage());
		        }
		    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
