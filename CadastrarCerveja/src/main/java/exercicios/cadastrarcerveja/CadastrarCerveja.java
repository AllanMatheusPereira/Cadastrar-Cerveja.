/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.cadastrarcerveja;

/**
 *
 * @author allan
 */
public class CadastrarCerveja {

    public static void main(String[] args) {
        
        Cervejas crv1 = new Cervejas(" Cerveja de milho " ," Baden " ,500 , 12.00);        
        crv1.setCodigoCerveja(40);
        crv1.setLocalidade("Baden");
        crv1.ExibeRelatorio();
        
        Cervejas crv2 = new Cervejas(" Cerveja purot malte " ," Spaten " ,350 ,5.99);
        crv2.setCodigoCerveja(55);
        crv2.setLocalidade("Alemã");
        crv2.ExibeRelatorio();
        
        Cervejas crv3 = new Cervejas(" Pilsen " ," Budweiser " ,350 ,7.99);
        crv3.setCodigoCerveja(22);
        crv3.setLocalidade("Americana");
        crv3.ExibeRelatorio();
        
        Cervejas crv4 = new Cervejas(" Choop " ," Patagonia " ,600 ,25.00);
        crv4.setCodigoCerveja(73);
        crv4.setLocalidade("Argentina");
        crv4.ExibeRelatorio();
        
        Cervejas crv5 = new Cervejas(" Lager " ," CasaBeer " ,2000 ,50.00);
        crv5.setCodigoCerveja(90);
        crv5.setLocalidade("Brasil");
        crv5.ExibeRelatorio();
    }
}