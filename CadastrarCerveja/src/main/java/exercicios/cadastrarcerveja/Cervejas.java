/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.cadastrarcerveja;

/**
 *
 * @author allan
 */
public class Cervejas {
    
    public String tipoCerveja;
    public String marcaCerveja;
    public double MlCerveja;
    public double valorCerveja;
    private int codigoCerveja;
    private String localidade;
    
    public Cervejas(String aCerveja, String eCerveja, int dCerveja, double fCerveja){
        this.tipoCerveja = aCerveja;
        this.marcaCerveja = eCerveja;
        this.MlCerveja = dCerveja;
        this.valorCerveja = fCerveja;
    }
    
    public void setCodigoCerveja(int codigoCerveja){
        this.codigoCerveja = codigoCerveja;
    }
    public int getCodigoCerveja(){
        return this.codigoCerveja;
    }
    public void setLocalidade(String localidade){
        this.localidade = localidade;
    }
    public String getLocalidade(){
        return this.localidade;
    }
    
    public void ExibeRelatorio(){
        System.out.println("\nNome da cerveja: " + this.tipoCerveja);
        System.out.println("Marca cerveja: " + this.marcaCerveja);
        System.out.println("ML cerveja: " + this.MlCerveja);
        System.out.println("Valor da cerveja: " + this.valorCerveja);
        System.out.println("Marca cerveja: " + this.marcaCerveja);
        System.out.println("Código da cerveja: " + getCodigoCerveja());
        System.out.println("Marca cerveja: " + getLocalidade());
    }
}
