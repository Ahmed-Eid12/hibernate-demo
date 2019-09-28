package com.ahmedeid.hibernatedemo.servletfactory;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ahmedeid.hibernatedemo.entities.School;
import com.ahmedeid.hibernatedemo.entities.Students;
import com.ahmedeid.hibernatedemo.hibernateutil.HibernateUtil;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * manage student life time
     * 
     * ahmed eid 
     * java developer 
     * it-blocks company
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Students student = new Students();
		
		student.setFull_name(request.getParameter("studentName"));
		student.setGender(request.getParameter("gender"));
		student.setDate_of_birth(Date.valueOf(request.getParameter("DateOfBirth")));
		student.setAddress(request.getParameter("address"));
		student.setEmail(request.getParameter("email"));
		student.setPassword(request.getParameter("password"));
		student.setSchool_id(request.getParameter("studentSchool"));
		
		// SessionFactory factory = new Configuration().configure("hibernate.config.xml").addAnnotatedClass(Students.class).addAnnotatedClass(School.class).buildSessionFactory();
		
		// Session session = factory.getCurrentSession();
		Session session = (Session) HibernateUtil.getSessionFactory();
		Transaction transaction = (Transaction) session.beginTransaction();
		
		session.save(student);
		
		try {
			transaction.commit();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		
		
		doGet(request, response);
	}

}
