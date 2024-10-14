package lk.iuhs.crm.repository;

import lk.iuhs.crm.entity.productentity;
import org.springframework.data.repository.CrudRepository;

public interface productrepository extends CrudRepository<productentity, Integer> {
}
