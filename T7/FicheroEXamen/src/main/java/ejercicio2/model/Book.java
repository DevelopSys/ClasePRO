package ejercicio2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private long id;
    private long Year;
    private String Title;
    private String handle;
    private String Publisher;
    private String ISBN;
    private long Pages;
    private String[] Notes;
    private Villain[] villains;
}
