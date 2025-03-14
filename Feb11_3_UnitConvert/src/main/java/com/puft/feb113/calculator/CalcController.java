package com.puft.feb113.calculator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class CalcController {
	
	
	@RequestMapping(value = "unit.convert", method = RequestMethod.GET)
	public String calcXY( HttpServletRequest req) {
	   CalculatorDAO cDAO = new CalculatorDAO();
		double input = Double.parseDouble(req.getParameter("input"));
        cDAO.Calculate(input, req.getParameter("option"));
        String option =  req.getParameter("option");
        req.setAttribute("input", input);
    
        req.setAttribute("output", cDAO.Calculate(input, req.getParameter("option")));
       
        
        if(option.equals("cm")) {
        	req.setAttribute("before", "cm");
        	req.setAttribute("after", "inch");
        	req.setAttribute("opt", "red");
        }else if(option.equals("m")) {
        	req.setAttribute("before", "㎡");
        	req.setAttribute("after", "평");
        	req.setAttribute("opt", "green");
        }else if(option.equals("cel")) {
           	req.setAttribute("before", "℃");
        	req.setAttribute("after", "℉");
        	req.setAttribute("opt", "blue");
        }else if(option.equals("speed")) {
           	req.setAttribute("before", "mi/h");
        	req.setAttribute("after", "km/h");
        	req.setAttribute("opt", "pink");
        } 
		
		
		return "output";
	}
	
}
