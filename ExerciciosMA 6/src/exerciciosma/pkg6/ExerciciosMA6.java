

package exerciciosma.pkg6;


public class ExerciciosMA6 {

  

    public static void main(String[] args) {
 
        Marca marca1 = new Marca("Toyota");
        Marca marca2 = new Marca("Honda");

 
        Vendedor vendedor1 = new Vendedor("Carlos");
        Vendedor vendedor2 = new Vendedor("Ana");

     
        Carro carro1 = new Carro("Corolla", 100000, marca1, vendedor1);
        Carro carro2 = new Carro("Civic", 120000, marca2, vendedor1);
        Carro carro3 = new Carro("Hilux", 200000, marca1, vendedor2);
        Carro carro4 = new Carro("HR-V", 150000, marca2, vendedor2);

 
        System.out.println("Média de preços da marca " + marca1.getNome() + ": " + marca1.calcularMediaPreco());
        System.out.println("Média de preços da marca " + marca2.getNome() + ": " + marca2.calcularMediaPreco());

     
        System.out.println("Carros vendidos por " + vendedor1.getNome() + ":");
        for (Carro carro : vendedor1.getCarrosVendidos()) {
            System.out.println(carro);
        }

        System.out.println("Carros vendidos por " + vendedor2.getNome() + ":");
        for (Carro carro : vendedor2.getCarrosVendidos()) {
            System.out.println(carro);
        }
    }
}