public class Polynomial{
  private String polynomial;
  private int degree;
  private int[] coefficients;
  
  public Polynomial(String polynomial){
    this.polynomial = polynomial;
    setArray();
  }
  
  private void setArray(){
    int index = 0;
    int i = 0;
    
    while(polynomial.indexOf("^") != -1) {
        coefficient[i] = Integer.parseInt(polynomial.substring(index, polynomial.indexOf("^"));
        i++;
        index = polynomial.indexOf("^")+3;
        polynomial = polynomial.substring(index);
    }
  }
}
