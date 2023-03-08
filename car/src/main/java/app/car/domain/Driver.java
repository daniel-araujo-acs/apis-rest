package app.car.domain;

import java.util.Date;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Driver {

    @Id
    Long id;
    String name;
    Date birthDate;

}
