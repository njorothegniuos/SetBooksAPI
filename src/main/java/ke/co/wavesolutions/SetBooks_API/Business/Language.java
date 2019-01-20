package ke.co.wavesolutions.SetBooks_API.Business;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Lang")
public class Language {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idxno; 
	public int LangCode; 
	public String Language; 
	public String Author; 
	
	

	public Language() {	
	}
	
	public Language(int langCode,String Author,String Language) {
		super();
		this.LangCode = langCode;
		this.Author = Author;
		this.Language = Language;
	}

	public int getidxno() {
		return idxno;   
	}

	public void setidxno(int id) {
		idxno = id;
	}
	
	public int getLangCode() {
		return LangCode;
	}

	public void setLangCode(int langCode) {
		this.LangCode = langCode;
	}
	
	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
}
}
