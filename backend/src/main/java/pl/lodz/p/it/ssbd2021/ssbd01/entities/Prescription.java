package pl.lodz.p.it.ssbd2021.ssbd01.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Typ Prescription.
 */
@Entity
@Table(name = "prescriptions")
@NamedQueries({
        @NamedQuery(name = "Prescription.findAll", query = "SELECT p FROM Prescription p"),
        @NamedQuery(name = "Prescription.findById", query = "SELECT p FROM Prescription p WHERE p.id = :id"),
        @NamedQuery(name = "Prescription.findByBusinessId", query = "SELECT p FROM Prescription p WHERE p.business = :business"),
        @NamedQuery(name = "Prescription.findByExpiration", query = "SELECT p FROM Prescription p WHERE p.expiration = :expiration"),
        @NamedQuery(name = "Prescription.findByMedications", query = "SELECT p FROM Prescription p WHERE p.medications = :medications"),
        @NamedQuery(name = "Prescription.findByVersion", query = "SELECT p FROM Prescription p WHERE p.version = :version"),
        @NamedQuery(name = "Prescription.findByCreationDateTime", query = "SELECT p FROM Prescription p WHERE p.creationDateTime = :creationDateTime"),
        @NamedQuery(name = "Prescription.findByModificationDateTime", query = "SELECT p FROM Prescription p WHERE p.modificationDateTime = :modificationDateTime")})
public class Prescription extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prescriptions_generator")
    @SequenceGenerator(name = "prescriptions_generator", sequenceName = "prescriptions_seq", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "id", updatable = false, nullable = false)
    @NotNull
    private Long id;

    @Basic(optional = false)
    @Column(name = "business_id", columnDefinition = "bpchar", nullable = false)
    @Size(min = 8, max = 8)
    @NotNull
    private String business;

    @Basic(optional = false)
    @Column(name = "expiration", updatable = false, nullable = false)
    @NotNull
    private LocalDateTime expiration;

    @Basic(optional = false)
    @Column(name = "medications", nullable = false)
    @NotNull
    private String medications;

    @JoinColumn(name = "doctor_id", referencedColumnName = "id", nullable = false, updatable = false)
    @ManyToOne(optional = false)
    @NotNull
    private Account doctor;

    @JoinColumn(name = "patient_id", referencedColumnName = "id", nullable = false, updatable = false)
    @ManyToOne(optional = false)
    @NotNull
    private Account patient;

    /**
     * Tworzy nową instancję klasy Prescription.
     */
    public Prescription() {
    }

    /**
     * Tworzy nową instancję klasy Prescription.
     *
     * @param medications przepisane leki
     */
    public Prescription(String medications) {
        this.medications = medications;
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getBusiness() {
        return business;
    }

    public LocalDateTime getExpiration() {
        return expiration;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public Account getDoctor() {
        return doctor;
    }

    public Account getPatient() {
        return patient;
    }

    @Override
    public String toString() {
        return "pl.lodz.p.it.ssbd2021.ssbd01.entities.Prescription[ id=" + id + " ]";
    }

}
