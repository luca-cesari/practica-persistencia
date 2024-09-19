package ar.edu.utn.frba.dds.ejercicio_02;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
@Setter
@Getter
public abstract class Persistente {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column(name = "activo")
    private Boolean activo;

}
