package immibis.bon.io;

import immibis.bon.NameSet;

public class MappingUnavailableException extends Exception {
    private static final long serialVersionUID = 1L;

    public MappingUnavailableException(NameSet from, NameSet to, String reason) {
        super("Can't create mapping from " + from + " to " + to + " - " + reason);
    }
}
