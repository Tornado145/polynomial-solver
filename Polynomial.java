public class Polynomial{
  private String polynomial;
  private int degree;
  private int[] coefficients;
  
  public Polynomial(int[] coefficients){
    this.coefficients = coefficients;
    setDegree(coefficients);
    setString();
  }
  
  public Polynomial(String polynomial){
    this.polynomial = polynomial;
    setArray();
  }
  
  private: 
    void setDegree(int[] coefficients){
      degree = coefficients.length;  
    }
   
    void setArray(){
    
    }
  
    void setString(){
    
    }
  
}
