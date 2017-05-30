package comptac.service;

import comptac.converter.OperationPonctuelleConverter;
import comptac.dto.OperationPonctuelleDTO;
import comptac.entity.OperationPonctuelle;
import comptac.entity.OperationRecurrente;
import comptac.entity.User;
import comptac.repository.OperationPonctuelleRepository;
import comptac.repository.OperationReccurenteRepository;
import comptac.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OperationPonctuelleServiceImpl implements OperationPonctuelleService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    OperationReccurenteRepository operationReccurenteRepository;

    @Autowired
    OperationPonctuelleRepository operationPonctuelleRepository;

    @Resource
    OperationPonctuelleConverter operationPonctuelleConverter;

    @Override
    public void createOperation(OperationPonctuelleDTO operationPonctuelleDTO) {
        User user = userRepository.findOne(operationPonctuelleDTO.getUserId());
        OperationRecurrente operationRecurrente = operationReccurenteRepository.findOne(operationPonctuelleDTO.getOperationRecurrente());
        OperationPonctuelle operationPonctuelle = operationPonctuelleConverter.toOperationPonctuelle(operationPonctuelleDTO,operationRecurrente,user);
        operationPonctuelleRepository.save(operationPonctuelle);
    }

    @Override
    public void updateOperation(OperationPonctuelleDTO operationPonctuelleDTO) {
        User user = userRepository.findOne(operationPonctuelleDTO.getUserId());
        OperationRecurrente operationRecurrente = operationReccurenteRepository.findOne(operationPonctuelleDTO.getOperationRecurrente());
        OperationPonctuelle operationPonctuelle = operationPonctuelleConverter.toOperationPonctuelle(operationPonctuelleDTO,operationRecurrente,user);
        operationPonctuelleRepository.save(operationPonctuelle);
    }

    @Override
    public void deleteOperation(int operationId) {
        operationPonctuelleRepository.delete(operationId);
    }

    @Override
    public List<OperationPonctuelleDTO> getOperations(int userId, int mois, int annee) {
        return null;
    }
}
