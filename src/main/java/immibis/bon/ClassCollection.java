package immibis.bon;

import lombok.Getter;
import org.objectweb.asm.tree.ClassNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClassCollection implements Cloneable {

	@Getter private NameSet nameSet;
	@Getter private Collection<ClassNode> classes = new ArrayList<>();
	@Getter private Map<String, byte[]> extraFiles = new HashMap<>();

	public ClassCollection(NameSet nameSet, Collection<ClassNode> classes) {
		this.nameSet = nameSet;
		this.classes.addAll(classes);
	}

	@Override
	public ClassCollection clone() {
		try {
			ClassCollection clone = (ClassCollection)super.clone();
			clone.classes = new ArrayList<>();

			classes.forEach(classNode -> {
				ClassNode ncn = new ClassNode();
				classNode.accept(ncn);
				clone.classes.add(ncn);
			});
			
			// copy map, but don't copy data
			clone.extraFiles = new HashMap<>(extraFiles);
			
			return clone;
			
		} catch(CloneNotSupportedException e) {
			throw new RuntimeException("This can't happen", e);
		}
	}
	
	public ClassCollection cloneWithNameSet(NameSet newNameSet) {
		ClassCollection rv = clone();
		rv.nameSet = newNameSet;
		return rv;
	}

	public Map<String, ClassNode> getClassMap() {
		Map<String, ClassNode> rv = new HashMap<>();
		classes.forEach(classNode -> rv.put(classNode.name, classNode));
		return rv;
	}

	
}
