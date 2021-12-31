package immibis.bon.gui;

import immibis.bon.NameSet;
import org.jetbrains.annotations.NotNull;

public enum Side {
	Universal(NameSet.Side.UNIVERSAL, "bin/minecraft"),
	Client(NameSet.Side.CLIENT, "bin/minecraft"),
	Server(NameSet.Side.SERVER, "bin/minecraft_server");
	
	Side(@NotNull NameSet.Side nsside, @NotNull String referencePath) {
		this.nsside = nsside;
		this.referencePath = referencePath;
	}
	
	public final NameSet.Side nsside;
	public final String referencePath;
}
