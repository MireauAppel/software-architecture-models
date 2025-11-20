package Bibliothèque;

import java.util.ArrayList;
import java.util.List;

public class CollectionDigitalMagazine {
        private final List<DigitalMagazine> magazines;

        public CollectionDigitalMagazine(List<DigitalMagazine> magazines) {
            this.magazines = magazines;
        }
        public CollectionDigitalMagazine() {
            this.magazines = new ArrayList<DigitalMagazine>();
        }

        public List<DigitalMagazine> getItems() {
            return magazines;
        }

        public void addItem(DigitalMagazine magazine) {
            magazines.add(magazine);
        }

        public void removeItem(DigitalMagazine magazine) {
            magazines.remove(magazine);
        }

        @Override
        public String toString() {
            String collection = "";
            for (DigitalMagazine magazine : magazines) {
                collection = collection + magazine.getDescription() + ", ";
            }
            return collection;
        }
}
