public class Prova {
  private double notaParte1;
  private double notaParte2;

  public void setNotaParte1(double notaParte1) {
     if (notaParte1 > 0 && notaParte1 < 5) {
        this.notaParte1 = notaParte1;
     }
  }

  public double getNotaParte1() {
     return this.notaParte1;
  }

  public void setNotaParte2(double notaParte2) {
     if (notaParte2 > 0 && notaParte2 < 5) {
        this.notaParte2 = notaParte2;
     }
  }

  public double getNotaParte2() {
     return this.notaParte2;
  }

  public double calcularNotaTotal() {
     return this.notaParte1 + this.notaParte2;
  } 
}
