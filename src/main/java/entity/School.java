package entity;

import javax.persistence.*;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Table(name = "school")
public class School {
    @Id
    int id;
    @Column(name = "school_number")
    private int SchoolNumber;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Principal principal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSchoolNumber() {
        return SchoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        SchoolNumber = schoolNumber;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }
}
