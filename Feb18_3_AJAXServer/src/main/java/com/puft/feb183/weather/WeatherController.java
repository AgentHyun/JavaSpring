package com.puft.feb183.weather;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeatherController {

	@Autowired
	private WeatherDAO wDAO;
	
	@RequestMapping(value = "/k.weather.get", method = RequestMethod.GET,
			produces = "application/xml;charset=UTF-8")
	public @ResponseBody String getKoreaWeather(HttpServletRequest req) {
		return wDAO.getKoreaWeather(req);
	}
}
