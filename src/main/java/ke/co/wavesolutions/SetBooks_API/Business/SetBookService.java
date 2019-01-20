package ke.co.wavesolutions.SetBooks_API.Business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.wavesolutions.SetBooks_API.Repo.SetBookRepository;


@Service
public class SetBookService {
	
	@Autowired
	private SetBookRepository setbookRepo;
	
  
  public List<SetBook> getAllsetBooks(int langCode){
	  List<SetBook> bk = new ArrayList<SetBook>();
	  setbookRepo.findByLanguageIdxno(langCode);
	   return bk;
  }
  
  public SetBook getsetBook(int bookCode) {
	  return setbookRepo.findOne(bookCode);
  }
  
  public void addBook(SetBook bk) {
	  setbookRepo.save(bk);
  }
  
  public void updatesetBook(SetBook bk) {
	  setbookRepo.save(bk);
  }
  
  public void deleteSetBook(int bookCode) {
	  setbookRepo.delete(bookCode);
  }
}
