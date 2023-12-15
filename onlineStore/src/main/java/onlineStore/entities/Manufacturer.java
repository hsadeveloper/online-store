package onlineStore.entities;



import java.sql.Timestamp;
import java.util.Set;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "manufacturer")
public class Manufacturer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "manufacturer_id")
  private Long manufacturerId;

  @Column(name = "manufacturer_name")
  private String manufacturerName;

  @CreationTimestamp
  @Column(name = "created_timestamp")
  private Timestamp createdTimestamp;

  @OneToMany(mappedBy = "manufacturer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Set<Product> products;



}
