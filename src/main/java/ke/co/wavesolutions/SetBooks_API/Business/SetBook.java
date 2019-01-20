package ke.co.wavesolutions.SetBooks_API.Business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SetBooks")
public class SetBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int Idxno; 
	public int bookCode;
	public String BookName; 
	
	@ManyToOne
	Language language;

	public  SetBook() {
		
	}
	
    public  SetBook(int Idxno,int bookCode,String BookName, int langCode) {
    	super();
    	this.Idxno = Idxno;
		this.bookCode = bookCode;
		this.BookName = BookName;
		this.language = new Language(langCode,"","");
	}

	public int getIdxno() {
		return Idxno;
	}

	public void setIdxno(int idxno) {
		Idxno = idxno;
	}
	
	public int getBookCode() {
		return bookCode;
	}
	
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}
	
	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
}
