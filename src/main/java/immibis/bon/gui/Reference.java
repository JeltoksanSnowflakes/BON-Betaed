package immibis.bon.gui;

import org.jetbrains.annotations.Nullable;

public class Reference<T> {
	public T val;
	
	public Reference() {}
	public Reference(@Nullable T val) {
		this.val = val;
	}
}
