package comptac.dto;

import java.sql.Date;

public class OperationPonctuelleDTO {

    private int userId;

    private int operationRecurrente;

    private int id;

    private String type;

    private Date date;

    private String libelle;

    private float montant;

    private  boolean paye;

    private boolean ventile;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOperationRecurrente() {
        return operationRecurrente;
    }

    public void setOperationRecurrente(int operationRecurrente) {
        this.operationRecurrente = operationRecurrente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
}
