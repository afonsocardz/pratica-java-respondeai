import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Materia {
  private String name;
  private String icon;
  private String color;
  private List<Assunto> assuntos = new ArrayList<>();

  public Materia(String name, String icon, String color) {
    this.name = name;
    this.icon = icon;
    this.color = color;
  }

  public Assunto[] getAssuntos() {
    return this.assuntos.toArray(new Assunto[0]);
  }

  public Assunto getAssunto(int index) {
    return this.assuntos.get(index);
  }

  public void setAssunto(Assunto assunto) {
    this.assuntos.add(assunto);
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public String getIcon() {
    return icon;
  }

}