package ifanow.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "transactions")
@JsonInclude(value = Include.NON_NULL)
public class Transaction implements Serializable {

	public enum TRANSACTION_MODES {
		NETBANKING,
		UPI,
		DEBITCARD,
		CREDITCARD,
		WALLET
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "userid", nullable = false)
	private Integer userId;
	
	@Column(name = "lat_lon")
	private String latLon;
	
	@Column(name = "noun")
	private String noun;
	
	@Column(name = "verb")
	private String verb;
	
	@Column(name="ts")
	private Date ts;
	
	@Column(name = "timespent")
	private Integer timespent;
	
	@Column(name = "bank")
	private String bank;
	
	@Column(name = "merchant_id", nullable = false)
	private String merchantId;
	
	@Column(name = "value")
	private float value;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "mode")
	private TRANSACTION_MODES mode;
	
	

}
