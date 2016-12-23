package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable{
	private String nickName;
	private int cp;
	private final PokemonType tpye;
	
	public Pokemon(String nickName,PokemonType tpye,int cp) {
		this.nickName = nickName;
		this.tpye = tpye;
		this.cp = cp;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public PokemonType getTpye() {
		return tpye;
	}






	@Override
	public abstract void attack();
	
}
