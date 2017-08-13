package by.intexsoft.SHJ2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author extends AbstractEntity {

    @Column(name = "name")
    public String name;

    @Column(name = "info")
    public String info;

}
