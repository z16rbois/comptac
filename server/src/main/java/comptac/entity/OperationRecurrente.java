package comptac.entity;

import javax.persistence.*;

@Entity
public class OperationRecurrente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int jour;

    private String libelle;

    private float montant;

    private TypeOperation type;

    @ManyToOne
    private User user;
}
