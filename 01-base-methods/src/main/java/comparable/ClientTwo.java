package comparable;

/**
 * This class doesn't implments comparable
 */
public class ClientTwo implements Comparable<ClientTwo>{

    private String document;

    public ClientTwo(String document) {
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    @Override
    public int compareTo(ClientTwo o) {
        return getDocument().compareTo(o.getDocument());
    }
}
