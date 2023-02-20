package adrian.savetravels.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "travels")
public class Travel {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private String expense;

  @NotNull
  private String vendor;

  @NotNull
  // @Size(min=1,max=5, message="thats not really your name!")
  private Integer Amount;

  @NotNull
  private String Description;

    // this will not allow the createdAt column to be updated after creation
    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;


   // Empty constructor

  public Travel() {
  }


   // Constructor with all fields // we do not need id , createdAt, updatedAt



  public Travel(Long id, String expense, String vendor, Integer Amount, String Description, Date createdAt, Date updatedAt) {
    this.expense = expense;
    this.vendor = vendor;
    this.Amount = Amount;
    this.Description = Description;
  }

    // Getters and Setters
  

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getExpense() {
    return this.expense;
  }

  public void setExpense(String expense) {
    this.expense = expense;
  }

  public String getVendor() {
    return this.vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public Integer getAmount() {
    return this.Amount;
  }

  public void setAmount(Integer Amount) {
    this.Amount = Amount;
  }

  public String getDescription() {
    return this.Description;
  }

  public void setDescription(String Description) {
    this.Description = Description;
  }

  public Date getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }



}
