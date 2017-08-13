package by.intexsoft.SHJ2.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book")
public class Book extends AbstractEntity {

    @Column(name = "name")
    public String name;

    @Column(name = "info")
    public String info;

}
