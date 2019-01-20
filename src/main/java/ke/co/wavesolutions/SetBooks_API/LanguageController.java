package ke.co.wavesolutions.SetBooks_API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ke.co.wavesolutions.SetBooks_API.Business.Language;
import ke.co.wavesolutions.SetBooks_API.Business.LanguageService;

@RestController
public class LanguageController {
	
	@Autowired
	private LanguageService langService;
	
	@RequestMapping("/Languages")
	public List<Language> getAllLanguages() {
		return langService.getAllanguages();
	}
	
	@RequestMapping("/Languages/{langCode}")
	public Language getLanguage(@PathVariable int langCode) {
		return langService.getLanguage(langCode);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Languages")
	public void addLanguage(@RequestBody Language l) {
	    langService.addlLanguage(l);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/Languages/{langCode}")
	public void updateLanguage(@PathVariable int langCode,@RequestBody Language l) {
	    langService.updateLanguage(langCode, l);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/Languages/{langCode}")
	public void deleteLanguage(@PathVariable int langCode) {
		 langService.deleteLang(langCode);
	}

}
