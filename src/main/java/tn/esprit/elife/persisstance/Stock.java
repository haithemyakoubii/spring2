package tn.esprit.elife.persisstance;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
@Entity
@Table(name = "Stock")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Stock implements Serializable {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="idStock")
	long idStock;
	Integer qteStock;
	Integer qteMin;
	String libelleStock;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "stockProduit")
   Set<Produit> produit;

}
