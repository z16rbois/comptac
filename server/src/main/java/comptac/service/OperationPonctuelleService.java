package comptac.service;

import comptac.dto.OperationPonctuelleDTO;

import java.util.List;

public interface OperationPonctuelleService {

    public void createOperation(OperationPonctuelleDTO operationPonctuelleDTO);

    public void updateOperation(OperationPonctuelleDTO operationPonctuelleDTO);

    public void deleteOperation(int operationId);

    public List<OperationPonctuelleDTO> getOperations(int userId, int mois, int annee);
}
