package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Columns;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("ladron")
public class Ladron extends Personaje{
  @Column(name = "nivelSiniestro", columnDefinition = "INTEGER(11)")
  private Integer nivelSiniestro;
  @Column(name = "tieneNavaja")
  private Boolean tieneNavaja;

  public void atacar(Personaje personaje) {
 //TODO
  }
}
