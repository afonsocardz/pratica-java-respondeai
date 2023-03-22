import java.util.ArrayList;
import java.util.List;

public class Assunto {
  private String name;
  private String image;
  private int order;
  private List<Topico> topicos = new ArrayList<>();

  public Assunto(String name, String image, int order) {
    this.name = name;
    this.image = image;
    this.order = order;
  }

  public String getName() {
    return name;
  }

  public String getImage() {
    return image;
  }

  public int getOrder() {
    return order;
  }

}
