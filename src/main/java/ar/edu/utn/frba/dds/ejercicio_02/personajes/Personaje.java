package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.ejercicio_02.Persistente;
import ar.edu.utn.frba.dds.ejercicio_02.converters.ElementoDefensorConverter;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@Entity
@Table(name = "personaje")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
@NoArgsConstructor
public class Personaje extends Persistente {

  @Getter
  @ElementCollection
  @CollectionTable(name = "ElementoDefensor")
  @Convert(converter = ElementoDefensorConverter.class)
  @Column(name = "elemento")
  private List<ElementoDefensor> elementos;

  @Getter @Setter
  @Column(name = "estamina", columnDefinition = "INTEGER(11)")
  private Integer estamina;

  @Getter @Setter
  @Column(name = "puntosDeVida", columnDefinition = "INTEGER(11)")
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
  //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

}
