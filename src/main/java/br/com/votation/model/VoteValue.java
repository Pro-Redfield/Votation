package br.com.votation.model;

public enum VoteValue {
	
	UPVOTE(1),
	DOWNVOTE(-1);
	
	private Integer value;
	
	private VoteValue(int value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return this.value;
	}
}
