package demo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/vijay")
public class VijayController {

	@GetMapping("/nanban")
	public ModelAndView nanbanPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Nanban Movie");
		modelAndView.addObject("Url", "/api/songs/nanban");
		return modelAndView;
	}
	@GetMapping("/NaalaiyaTheerpu")
	public ModelAndView NaalaiyaTheerpuPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "NaalaiyaTheerpu Movie");
		modelAndView.addObject("Url", "/api/songs/NaalaiyaTheerpu");
		return modelAndView;
	}
	
	@GetMapping("/GOAT")
	public ModelAndView GOATPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "GOAT Movie");
		modelAndView.addObject("Url", "/api/songs/GOAT");
		return modelAndView;
	}
	
	@GetMapping("/Leo")
	public ModelAndView LeoPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Leo Movie");
		modelAndView.addObject("Url", "/api/songs/Leo");
		return modelAndView;
	}
	
	@GetMapping("/Varisu")
	public ModelAndView VarisuPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Varisu Movie");
		modelAndView.addObject("Url", "/api/songs/Varisu");
		return modelAndView;
	}
	@GetMapping("/Beast")
	public ModelAndView BeastPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Beast Movie");
		modelAndView.addObject("Url", "/api/songs/beast");
		return modelAndView;
	}
	@GetMapping("/Master")
	public ModelAndView MasterPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Master Movie");
		modelAndView.addObject("Url", "/api/songs/master");
		return modelAndView;
	}
	@GetMapping("/Bigil")
	public ModelAndView BigilPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Bigil Movie");
		modelAndView.addObject("Url", "/api/songs/Bigil");
		return modelAndView;
	}
	@GetMapping("/sarkar")
	public ModelAndView SarkarPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Sarkar Movie");
		modelAndView.addObject("Url", "/api/songs/Sarkar");
		return modelAndView;
	}
	@GetMapping("/Mersal")
	public ModelAndView MersalPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Mersal Movie");
		modelAndView.addObject("Url", "/api/songs/Mersal");
		return modelAndView;
	}
	@GetMapping("/Bairava")
	public ModelAndView BairavaPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Bairava Movie");
		modelAndView.addObject("Url", "/api/songs/Bairava");
		return modelAndView;
	}
	@GetMapping("/Theri")
	public ModelAndView TheriPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Theri Movie");
		modelAndView.addObject("Url", "/api/songs/Theri");
		return modelAndView;
	}
	@GetMapping("/Puli")
	public ModelAndView PuliPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Puli Movie");
		modelAndView.addObject("Url", "/api/songs/Puli");
		return modelAndView;
	}
	@GetMapping("/Kaththi")
	public ModelAndView KaththiPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Kaththi Movie");
		modelAndView.addObject("Url", "/api/songs/kaththi");
		return modelAndView;
	}
	@GetMapping("/Thalaiva")
	public ModelAndView ThalaivaPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Thalaiva Movie");
		modelAndView.addObject("Url", "/api/songs/Thalaiva");
		return modelAndView;
	}
	
	@GetMapping("/Thuppakki")
	public ModelAndView ThuppakkiPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Thuppakki Movie");
		modelAndView.addObject("Url", "/api/songs/Thuppakki");
		return modelAndView;
	}
	
	@GetMapping("/Velayudham")
	public ModelAndView VelayudhamPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Velayudham Movie");
		modelAndView.addObject("Url", "/api/songs/Velayudham");
		return modelAndView;
	}
	
	@GetMapping("/Kaavalan")
	public ModelAndView KaavalanPage() {
		ModelAndView modelAndView = new ModelAndView("Album");
		modelAndView.addObject("Title", "Kaavalan Movie");
		modelAndView.addObject("Url", "/api/songs/Kaavalan");
		return modelAndView;
	}
}
