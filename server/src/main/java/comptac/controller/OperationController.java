package comptac.controller;

import comptac.dto.OperationPonctuelleDTO;
import comptac.service.OperationPonctuelleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {

    @Autowired
    OperationPonctuelleService operationPonctuelleService;

    @RequestMapping(value="/operationPonctuelle", method = RequestMethod.POST)
    public void createOperationPonctuelle(@RequestParam OperationPonctuelleDTO operationPonctuelleDTO){
        operationPonctuelleService.createOperation(operationPonctuelleDTO);
    }

    @RequestMapping(value="/operationPonctuelle", method = RequestMethod.PUT)
    public void updateOperationPonctuelle(@RequestParam OperationPonctuelleDTO operationPonctuelleDTO){
        operationPonctuelleService.updateOperation(operationPonctuelleDTO);
    }

    @RequestMapping(value="/operationPonctuelle", method = RequestMethod.DELETE)
    public void deleteOperationPonctuelle(@RequestParam int operationPonctuelleId){
        operationPonctuelleService.deleteOperation(operationPonctuelleId);
    }
}
