package comptac.repository;


import comptac.entity.OperationPonctuelle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationPonctuelleRepository extends CrudRepository<OperationPonctuelle, Integer>{

        }
