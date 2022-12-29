package tn.esprit.elife.persisstance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureRepository  extends CrudRepository<Facture, Long> {

}
