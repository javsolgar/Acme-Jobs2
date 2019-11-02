
package acme.entities.offers;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Offers extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	//Attributes

	@NotBlank
	private String				title;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				moment;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				deadline;

	@NotBlank
	private String				description;

	private Money				lowerRange;

	private Money				majorRange;

	@NotBlank
	@Column(unique = true)
	//@Pattern("([R]{1})([A-Z]{})([-])([0-9]{5})")
	private String				idOffer;

}
