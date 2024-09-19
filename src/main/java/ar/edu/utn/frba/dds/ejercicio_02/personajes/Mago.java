package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.*;

import javax.persistence.*;


@Entity
@DiscriminatorValue("ladron")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Mago  extends Personaje{
  @Column(name = "nivelDeMagia")
  private Integer nivelDeMagia;
  @Column(name = "tieneAlas")
  private Boolean tieneAlas;

  public void atacar(Personaje personaje) {
 //TODO
  }


}
