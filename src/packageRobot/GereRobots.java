package packageRobot;

public class GereRobots {

	public static void main(String[] args) {
		String temporaire1;
		String temporaire2;
		
		
		//ajouter une variable temporaire pour le statut
		Robot Robot1 = new Robot("Explorant",5,510);
		Robot Robot2 = new Robot("Retour au bercail",2,822);
		
		
		System.out.println("Affichage des attributs avant l'écahnge");
		System.out.println("");
		
		System.out.println("Affichage du Robot1");
		System.out.println("-------------------");
		Robot1.montreAttributs();
		System.out.println("");
		
		System.out.println("Affichage du Robot2");
		System.out.println("-------------------");
		Robot2.montreAttributs();
		System.out.println("");
		
		
		//On utilise une varible temporaire pour stocker le statut du robot 1 et robot2
		temporaire1 = Robot1.getStatut();

		
		
		//Changement des attributs du ROBOT 1
		Robot1.setStatut(Robot2.getStatut());
		Robot1.setVitesse(((Robot2.getVitesse()+ Robot1.getVitesse())/2)+1);

		System.out.println("");
		//Changement des attributs du ROBOT 2	
		Robot2.setStatut(temporaire1);
		Robot2.setTemperature(100 +Robot1.getTemperature());
		
		
		//Affichage des attributs modifiers
		System.out.println("");
		System.out.println("Affichage des attributs apres l'écahnge");
		System.out.println("");
		
		
		
		System.out.println("Affichage du robot 1");
		System.out.println("-------------------");
		System.out.println("Statut "+Robot1.getStatut());
		System.out.println("Vitesse : " + Robot1.getVitesse());
		
		System.out.println("");
		
		
		
		System.out.println("Affichage du robot 2");
		System.out.println("-------------------");
		System.out.println("Statut : " + Robot2.getStatut());
		System.out.println("Temperature : " + Robot2.getTemperature());


		//Robot1.montreAttributs();
		//System.out.println("");
		//Robot2.montreAttributs();
	}

}
