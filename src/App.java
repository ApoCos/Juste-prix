import java.util.Random; /*librairie à importer pour le random*/
import java.util.Scanner; /*importation de la librairie scanner */

public class App {
    public static void main(String[] args) {
        
        Random r = new Random(); /*on crée la variable random qui choisira un nombre aléatoire entre 0 et 200*/
        int justePrix = r.nextInt(200); /*on définit la limite à 200 pour le chiffre aléatoire */
        int prix = 0; /*on définit la valeur de base pour le chiffre aléatoire */
        int nbEssai = 0; /*on definit une variable qui comptera le nombre d'essai que l'on fait pour trouver le justePrix */

        // System.out.println("le justePrix : " + justePrix);

        //on cré la boucle qui va se répéter tant que la condition n'est pas remplie
        while(justePrix != prix){

            System.out.println("Entrez un numéro entre 0 et 200 :");

            Scanner scan = new Scanner(System.in); /*sert à pouvoir écrire dans la console et à lire ce qui a été écrit */

            prix = scan.nextInt();/*le nextInt() permet de récupérer le dernier entier qui a été mis dans la console */

            if(justePrix > prix){
                System.out.println("C'est plus");
            } else if(justePrix < prix) {
                System.out.println("C'est moins");
            } else {
                //message qui apparaît lorsque le prix est trouvé et donc le jeu gagné
        System.out.println("Bravo ! Le juste prix est: " + justePrix);
        System.out.println("Tu as trouvé en " + nbEssai + "fois");
            }
            nbEssai++;
        }
        
    }
}
