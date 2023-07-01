package Nutrition;


public class Nutrition {
    public static void main(String[] args) {
       FileIN f = new FileIN("http://www.di.ubi.pt/~jpaulo/ensino/IHC/praticas/nutrition.txt");
        
       f.open();
        
       String[] linhas;
       linhas = f.readAll();
        
       System.out.printf("%-35s%10s%10s%10s%10s%10s%10s%10s%10s\n", "Food", "Calcium [mg]", "Serving Size", "Weight [g]", "Percent Water", "Energy [kcal]", "kcal/100g", "Protein [g]", "Carbohydrate [g]");
        
       double addCalcium=0, addWeight=0, addWater=0, addEnergy=0,addEnergypor100=0 ,addProtein=0, addCarbohydrate=0; 
       int linha;
       
       for(linha = 1; linha<linhas.length; linha++){
           //System.out.println(linhas[i]);
           String[] palavrasdaslinhas;
           palavrasdaslinhas = linhas[linha].split("[|]");
           
           String foodName = palavrasdaslinhas[0];
           double calcium = Double.parseDouble(palavrasdaslinhas[1]);
           String servingSize = palavrasdaslinhas[2];
           double weight = Double.parseDouble(palavrasdaslinhas[3]);
           double percentWater = Double.parseDouble(palavrasdaslinhas[4]);
           double energy = Double.parseDouble(palavrasdaslinhas[5]);
           double protein = Double.parseDouble(palavrasdaslinhas[6]);
           double carbohydrate = Double.parseDouble(palavrasdaslinhas[7]);
           double energy100g = 100*energy/weight;
           
           addCalcium += calcium;
           addWeight += weight;
           addWater += percentWater;
           addEnergy += energy;
           addEnergypor100 += energy100g;
           addProtein += protein;
           addCarbohydrate += carbohydrate;
        
           System.out.printf("%-35s %10.1f %10s %10.1f %10.1f %10.1f %10.1f %10.1f %10.1f\n",foodName, calcium, servingSize, weight, percentWater, energy, energy100g, protein, carbohydrate);
        } 
       
       System.out.printf("\n%-35s %10.1f %10s %10.1f %10.1f %10.1f %10.1f %10.1f %10.1f\n", "Média:", addCalcium/linha, "", addWeight/linha, addWater/linha, addEnergy/linha, addEnergypor100/linha, addProtein/linha, addCarbohydrate/linha);
       
       
       f.close();
    }
}
