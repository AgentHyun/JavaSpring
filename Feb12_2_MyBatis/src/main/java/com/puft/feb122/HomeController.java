package com.puft.feb122;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.puft.feb122.score.Score;
import com.puft.feb122.score.ScoreDAO;
import com.puft.feb122.student.Student;
import com.puft.feb122.student.StudentDAO;
import com.puft.feb122.test.TestDAO;







@Controller
public class HomeController {

	
	@Autowired
	private StudentDAO sDAO;
	@Autowired
	private ScoreDAO scDAO;
	@Autowired
	private TestDAO tDAO;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Score s2, Student s, HttpServletRequest req) {
		
		sDAO.getAllStudent(req);
		tDAO.getAllTest(req);
		scDAO.getAllScore(req);
		return "index_pro";
	}
	
}





