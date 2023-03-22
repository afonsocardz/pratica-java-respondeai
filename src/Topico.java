import java.util.ArrayList;
import java.util.List;

public class Topico {
  private String name;
  private boolean isDone = false;
  private Teoria teoria;
  private List<Exercicio> exercicios = new ArrayList<>();

  public Topico (String name, Teoria teoria) {
    this.name = name;
    this.teoria = teoria;
  }

  public List<Exercicio> getExercicios () {
    return this.exercicios;
  }

  public String getName() {
    return name;
  }
}
