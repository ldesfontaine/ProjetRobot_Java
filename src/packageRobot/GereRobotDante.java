package packageRobot;

public class GereRobotDante {

	public static void main(String[] args) {
		Robot RobotDante = new Robot("Explorant",2,510);
		System.out.println("On affiche les attributs definit par defaut");
		RobotDante.montreAttributs();
		System.out.println("");
		
		System.out.println("Modification de la vitesse");
		RobotDante.setVitesse(3);
		RobotDante.montreAttributs();
		System.out.println("");
		
		System.out.println("Modification de la température");
		RobotDante.setTemperature(670);
		RobotDante.montreAttributs();
		System.out.println("");
		
		System.out.println("On verifie la température");		
		RobotDante.verifieTemperature();
		RobotDante.montreAttributs();
		System.out.println("");
		
		System.out.println("On convertit la température Fahrenheit en Celsius");
		RobotDante.farToCel();
		RobotDante.montreAttributs();
		
		
	}

	}

