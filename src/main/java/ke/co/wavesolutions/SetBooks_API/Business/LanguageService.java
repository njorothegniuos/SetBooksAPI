package ke.co.wavesolutions.SetBooks_API.Business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.wavesolutions.SetBooks_API.Repo.LanguageRepository;


@Service
public class LanguageService {
	
	@Autowired
	private LanguageRepository langRepo;
	

  private List<Language> lang = new ArrayList<>(Arrays.asList(
		  new Language(1,"FRENCH","Tester")
		  ));
  
  public List<Language> getAllanguages(){
	  List<Language> l = new ArrayList<Language>();
	   langRepo.findAll().forEach(l::add);
	   return l;
  }
  
  public Language getLanguage(int Id) {
	  return lang.stream().filter(t->t.getidxno()==(Id)).findFirst().get();
  }
  
  public void addlLanguage(Language l) {
	  langRepo.save(l);
  }
  
  public void updateLanguage(int Id,Language l) {
	  for(int i =0; i< lang.size(); i++) {
		  Language lg = lang.get(i);
		  if(lg.getidxno()==Id) {
			  lang.set(i, l);
			  return;
		  }
	  }
  }
  
  public void deleteLang(int Id) {
	  lang.removeIf(t->t.getidxno()==Id);
  }
}
