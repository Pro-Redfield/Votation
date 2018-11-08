package br.com.votation.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vote {
	
	private Long id;
	
	private Votation votation;
	
	private Option option;
	
	private Client user;
	
	private VoteValue value;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@OneToOne
	public Votation getVotation() {
		return votation;
	}

	public void setVotation(Votation votation) {
		this.votation = votation;
	}

	@OneToOne
	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	@OneToOne
	public Client getUser() {
		return user;
	}

	public void setUser(Client user) {
		this.user = user;
	}

	@Enumerated(EnumType.STRING)
	public VoteValue getValue() {
		return value;
	}

	public void setValue(VoteValue value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vote other = (Vote) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
