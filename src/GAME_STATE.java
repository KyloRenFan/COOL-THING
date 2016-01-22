
public enum GAME_STATE {
	
	SINGAME(true,true,true,true),
	OINGGAMW(true,false,true,true),
	OAFTERGAME(false,false,true,true),
	SAFTERGAMW(false,true,true,true),
	SBEFORGAME(false,true,false,true),
	OBEFORGAME(false,false,false,true),
	SINGAMEB(true,true,true,false),
	SINGAMEBB(true,true,false,false),
	OINGAMEB(true,false,true,false),
	OINGAMEBB(true,false,false,false);
	
	
	boolean Multiplayer;
	boolean IG;
	boolean MSIS;
	boolean PVIS;


	GAME_STATE(boolean INGAME, boolean Multiplayer, boolean MVIS,boolean PVIS) {
		this.Multiplayer = Multiplayer;
		this.IG = INGAME;
		this.MSIS = MVIS;
		this.PVIS = PVIS;
	}


	public boolean isMultiplayer() {
		return Multiplayer;
	}


	public void setMultiplayer(boolean multiplayer) {
		Multiplayer = multiplayer;
	}


	public boolean isIG() {
		return IG;
	}


	public void setIG(boolean iG) {
		IG = iG;
	}


	public boolean isMSIS() {
		return MSIS;
	}


	public void setMSIS(boolean mSIS) {
		MSIS = mSIS;
	}


	public boolean isPVIS() {
		return PVIS;
	}


	public void setPVIS(boolean pVIS) {
		PVIS = pVIS;
	}
}
