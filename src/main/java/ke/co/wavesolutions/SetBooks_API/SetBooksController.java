package ke.co.wavesolutions.SetBooks_API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ke.co.wavesolutions.SetBooks_API.Business.Language;
import ke.co.wavesolutions.SetBooks_API.Business.SetBook;
import ke.co.wavesolutions.SetBooks_API.Business.SetBookService;

@RestController
public class SetBooksController {
	
	@Autowired
	private SetBookService setbkService;
	
	@RequestMapping("/Languages/{langCode}/SetBooks")
	public List<SetBook> getAllSetBooks(@PathVariable int langCode) {
		return setbkService.getAllsetBooks(langCode);
	}
	
	@RequestMapping("/Languages/{langCode}/SetBooks/{bookCode}")
	public SetBook getsetBook(@PathVariable int bookCode) {
		return setbkService.getsetBook(bookCode);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Languages/{Id}/SetBooks")
	public void addsetBook(@RequestBody SetBook bk, @PathVariable int Id) {
		bk.setLanguage(new Language(Id,"",""));
		setbkService.addBook(bk);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/Languages/{langCode}/SetBooks/{bookCode}")
	public void updatesetBook(@PathVariable int bookCode,@PathVariable int Id,@RequestBody SetBook sb) {
		sb.setLanguage(new Language(Id,"",""));
		setbkService.updatesetBook(sb);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/Languages/{langCode}/SetBooks/{bookCode}")
	public void deleteSetBook(@PathVariable int bookCode) {
		setbkService.deleteSetBook(bookCode);
	}

}
