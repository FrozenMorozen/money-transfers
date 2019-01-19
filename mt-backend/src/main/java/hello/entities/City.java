package hello.entities;

import javax.persistence.*;

@Entity
public class City {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    // не создался foreign key
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country")
    private Country country;

    public City() {}

    public City(String name) {
        this.name = name;
    }

    public City(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
