package com.project.examportal.ExamPortalApplicationProject.Controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.examportal.ExamPortalApplicationProject.Model.Question;

import jakarta.servlet.http.HttpSession;

@RestController
public class QuestionController {

	@Autowired
	SessionFactory sf;
	
	@GetMapping("getfirstQuestion/{subject}")
	public Question getfirstQuestion(@PathVariable String subject) {
		
		HttpSession httpSession=LoginController.httpsession;
		Session openSession=sf.openSession();
		
		Query query = openSession.createQuery("from Question where subject=:subject");
		
		query.setParameter("subject", subject);
		
		List<Question> list = query.list();
	
		Question question=list.get(0);
		return question;	
	}
	@RequestMapping("nextQuestion")
	public Question nextQuestion() {
		
		HttpSession httpSession = LoginController.httpsession;
		List<Question> listofquestion =(List<Question>)httpSession.getAttribute("allquestions");
		Question question = null;
		if((int)httpSession.getAttribute("questionIndex")<listofquestion.size()-1) {
			httpSession.setAttribute("questionIndex", (int) httpSession.getAttribute("questionIndex")+1);
			listofquestion.get((int)httpSession.getAttribute("questionIndex"));
		}
		else {
			httpSession.setAttribute("questionIndex", 0);
			listofquestion.get((int)httpSession.getAttribute("questionIndex"));
		}
		return question;
	}
}
