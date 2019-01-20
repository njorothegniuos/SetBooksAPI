package ke.co.wavesolutions.SetBooks_API.Repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ke.co.wavesolutions.SetBooks_API.Business.SetBook;

public interface SetBookRepository extends CrudRepository<SetBook, Integer> {
    
	public List<SetBook> findByLanguageIdxno(int Id);
}
