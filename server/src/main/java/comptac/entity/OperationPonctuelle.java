package comptac.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class OperationPonctuelle {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @ManyToOne
    private User user;

    @OneToOne
    private OperationRecurrente operationRecurrente;

    private int id;

    private TypeOperation type;

    private Date date;

    private String libelle;

    private float montant;

    private  boolean paye;

    private boolean ventile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeOperation getType() {
        return type;
    }

    public void setType(TypeOperation type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public boolean isPaye() {
        return paye;
    }

    public void setPaye(boolean paye) {
        this.paye = paye;
    }

    public boolean isVentile() {
        return ventile;
    }

    public void setVentile(boolean ventile) {
        this.ventile = ventile;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OperationRecurrente getOperationRecurrente() {
        return operationRecurrente;
    }

    public void setOperationRecurrente(OperationRecurrente operationRecurrente) {
        this.operationRecurrente = operationRecurrente;
    }
}
