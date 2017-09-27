package io.vinoth.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import io.vinoth.springboot.model.Search;
import io.vinoth.springboot.model.WeatherAPI;


@Controller
public class MainController {
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String homePage() {
		return "index";
	}
	
	 @RequestMapping(value="/getWeatherStatus", method=RequestMethod.POST)
	    public @ResponseBody WeatherAPI customerForm(@RequestParam("name") String countryName) {
		 
		 	//System.out.println(search);
		 	
	        RestTemplate restTemplate = new RestTemplate();
		     
			 WeatherAPI weather = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+countryName+"&APPID=aaab599e5133b89bd426932f44f55dd8", WeatherAPI.class);
		     System.out.println(weather);
		    
		       
//		    ResponseEntity<String> entity = restTemplate.getForEntity("http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=aaab599e5133b89bd426932f44f55dd8", String.class);
//		    String body = entity.getBody();
//		    MediaType contentType = entity.getHeaders().getContentType();
//		    HttpStatus statusCode = entity.getStatusCode();
//		    
//		    //System.out.println(body);
	        
	        return weather;
	    }

}
