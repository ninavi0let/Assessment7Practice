package co.grandcircus.Assessment7Practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BreweryController {

	
	@RequestMapping("get-jokes")
	public ModelAndView jokes(int brewery_name) {
		RestTemplate restTemplate = new RestTemplate();
        BreweryResults jokes = restTemplate.getForObject("https://api.openbrewerydb.org/breweries" + brewery_name, BreweryResults.class);
		
		return new ModelAndView("brewery", "brewery_type", brewery);
	}
}
