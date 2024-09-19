package ar.edu.utn.frba.dds.ejercicio_02;

import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="jugador")
public class Jugador extends Persistente{
  @Column(name = "nombre", columnDefinition = "VARCHAR(50)")
  private String nombre;
  @Column(name = "apellido", columnDefinition = "VARCHAR(50)")
  private String apellido;
  @Column(name = "fechaAlta", columnDefinition = "DATE")
  private LocalDate fechaAlta;
  @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
  @JoinColumn(name = "personaje_id", columnDefinition = "INTEGER(11)")
  private Personaje personaje;

  public Jugador() {
    this.fechaAlta = LocalDate.now();
  }

  public void cambiarPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }
}
