package com.kodz.michal;

public class Word {
	private int id;
	private String polishWord;
	private String frenchWord;
	private Kind kind;
	private static int counter=0;
	//TODO moze pole odpowiedzialne za numer rozdzialu? ale raczej nie
	
	
	
	public Word(String polishWord, String frenchWord, Kind kind) {
		this.id = counter++;
		this.polishWord = polishWord;
		this.frenchWord = frenchWord;
		this.kind = kind;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolishWord() {
		return polishWord;
	}
	public void setPolishWord(String polishWord) {
		this.polishWord = polishWord;
	}
	public String getFrenchWord() {
		return frenchWord;
	}
	public void setFrenchWord(String frenchWord) {
		this.frenchWord = frenchWord;
	}
	public Kind getKind() {
		return kind;
	}
	public void setKind(Kind kind) {
		this.kind = kind;
	}
	@Override
	public String toString() {
		return "Word [id=" + id + ", polishWord=" + polishWord
				+ ", frenchWord=" + frenchWord + ", kind=" + kind + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((frenchWord == null) ? 0 : frenchWord.hashCode());
		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
		result = prime * result
				+ ((polishWord == null) ? 0 : polishWord.hashCode());
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
		Word other = (Word) obj;
		if (frenchWord == null) {
			if (other.frenchWord != null)
				return false;
		} else if (!frenchWord.equals(other.frenchWord))
			return false;
		if (kind != other.kind)
			return false;
		if (polishWord == null) {
			if (other.polishWord != null)
				return false;
		} else if (!polishWord.equals(other.polishWord))
			return false;
		return true;
	}
	

}
