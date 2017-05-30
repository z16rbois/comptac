package comptac.converter;

import comptac.dto.OperationPonctuelleDTO;
import comptac.entity.OperationPonctuelle;
import comptac.entity.OperationRecurrente;
import comptac.entity.TypeOperation;
import comptac.entity.User;

import javax.validation.constraints.NotNull;

public class OperationPonctuelleConverter {

    public OperationPonctuelle toOperationPonctuelle(OperationPonctuelleDTO operationPonctuelleDTO, OperationRecurrente operationRecurrente, @NotNull User user){
        OperationPonctuelle operationPonctuelle = new OperationPonctuelle();
        operationPonctuelle.setDate(operationPonctuelleDTO.getDate());
        operationPonctuelle.setId(operationPonctuelleDTO.getId());
        operationPonctuelle.setLibelle(operationPonctuelleDTO.getLibelle());
        operationPonctuelle.setMontant(operationPonctuelleDTO.getMontant());
        operationPonctuelle.setPaye(operationPonctuelleDTO.isPaye());
        operationPonctuelle.setType(TypeOperation.valueOf(operationPonctuelleDTO.getType()));
        if (operationRecurrente != null) {
            operationPonctuelle.setOperationRecurrente(operationRecurrente);
        }
        operationPonctuelle.setVentile(operationPonctuelleDTO.isVentile());
        operationPonctuelle.setUser(user);

        return operationPonctuelle;
    }

}
