package comparable;

public class ComparableExample {

    static class ClientOne {

        private String document;

        public ClientOne(String document) {
            this.document = document;
        }

        public String getDocument() {
            return document;
        }
    }


    static class ClientTwo implements Comparable<ClientTwo>{

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

        @Override
        public String toString() {
            return document;
        }
    }
}
