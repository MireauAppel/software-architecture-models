package Bibliothèque;

public sealed interface DigitalMedia permits AudioBook, DigitalMagazine, eBook {
    String getDescription();
}
