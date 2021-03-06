package flowershop.flowerSearch.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Flower {
    @Id
    @GeneratedValue
    @Column(name="flower_id")
    private Long id;
    private Long birthMonth;
    private String flowerName;
}
