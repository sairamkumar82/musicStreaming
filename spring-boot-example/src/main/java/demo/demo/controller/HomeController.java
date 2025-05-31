package demo.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import demo.demo.model.movies;
@RestController
//@RequestMapping("/api")
public class HomeController {

	@GetMapping("/hello")
	public String sayHello() {
		System.out.print("Hey----------");
		return "Hello, World!";
	}

	@GetMapping("/zoom")
	public ModelAndView homePage() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("message", "Welcome to the Music Streaming App!");
		return modelAndView;
	}
	
	@GetMapping("/Illaiyaraja")
	public ModelAndView IllaiyarajaPage() {
		ModelAndView modelAndView = new ModelAndView("Ilayaraja");
		modelAndView.addObject("message", "Welcome to the Music Streaming App!");
		return modelAndView;
	}
	
	@GetMapping("/Vijay")
	public ModelAndView VijayPage() {
		ModelAndView modelAndView = new ModelAndView("Vijay");
		modelAndView.addObject("message", "Welcome to the Music Streaming App!");
		modelAndView.addObject("Artist", "Vijay Filmography");
		return modelAndView;
	}
	
	@GetMapping("/Sivakarthikayan")
	public ModelAndView SivakarthikayanPage() {
		
		 List<movies> movies = Arrays.asList(
		            new movies(2012, "Marina", "Senthilnathan \"Nathan\"", ""),
		            new movies(2012, "3", "Kumaran", ""),
		            new movies(2012, "Manam Kothi Paravai", "Kannan", ""),
		            new movies(2013, "Kedi Billa Killadi Ranga", "Pattai Murugan / Ranga Murugan", ""),
		            new movies(2013, "Ethir Neechal", "Kunjithapatham \"Harish\"", ""),
		            new movies(2013, "Varuthapadatha Valibar Sangam", "Bose Pandi", ""),
		            new movies(2014, "Maan Karate", "Peter", ""),
		            new movies(2015, "Kaaki Sattai", "Madhimaran Ratnavel", ""),
		            new movies(2015, "Vajrakaya", "Himself", "Kannada film; cameo appearance"),
		            new movies(2016, "Rajinimurugan", "Rajinimurugan / Bosepandi", ""),
		            new movies(2016, "Remo", "Siva Karthikeyan \"SK\" / Regina Motwani \"Remo\"", ""),
		            new movies(2017, "Velaikkaran", "Arivazhagan \"Arivu\"", ""),
		            new movies(2018, "Seemaraja", "Seemaraja / Kadambavel Raja", ""),
		            new movies(2018, "Kanaa", "Nelson Dilipkumar", "Special appearance"),
		            new movies(2019, "Mr. Local", "Manohar", ""),
		            new movies(2019, "Kousalya Krishnamurthy", "Nelson Dilipkumar", "Telugu film; special appearance"),
		            new movies(2019, "Namma Veettu Pillai", "Arumpon", ""),
		            new movies(2019, "Hero", "Sakthivel \"Sakthi\"", ""),
		            new movies(2021, "Doctor", "Dr. Varun", ""),
		            new movies(2022, "Don", "Chakaravarthi \"Don\"", ""),
		            new movies(2022, "Prince", "Anbarasan", ""),
		            new movies(2023, "Maaveeran", "Sathya", ""),
		            new movies(2024, "Ayalaan", "Tamizh", ""),
		            new movies(2024, "SK 21", "TBA", "Filming")
		        );
		ModelAndView modelAndView = new ModelAndView("Artist");
		modelAndView.addObject("movies", movies);
		modelAndView.addObject("Artist", "Sivakarthikayan Filmography");
		return modelAndView;
	}
	
	@GetMapping("/Rajinikanth")
	public ModelAndView RajinikanthPage() {
		ModelAndView modelAndView = new ModelAndView("Rajinikanth");
		modelAndView.addObject("message", "Welcome to the Music Streaming App!");
		return modelAndView;
	}
	
	@GetMapping("/Prabu")
	public ModelAndView PrabuPage() {
		ModelAndView modelAndView = new ModelAndView("Prabu");
		modelAndView.addObject("message", "Welcome to the Music Streaming App!");
		return modelAndView;
	}
	
	@GetMapping("/Ajith")
	public ModelAndView AjithPage() {
		ModelAndView modelAndView = new ModelAndView("Ajith");
		modelAndView.addObject("message", "Welcome to the Music Streaming App!");
		return modelAndView;
	}
	
	@GetMapping("/Mohan")
	public ModelAndView MohanPage() {
		ModelAndView modelAndView = new ModelAndView("Mohan");
		modelAndView.addObject("message", "Welcome to the Music Streaming App!");
		return modelAndView;
	}
}
