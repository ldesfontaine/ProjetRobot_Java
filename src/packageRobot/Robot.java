package packageRobot;

public class Robot {
	
    public Robot(String statut, int vitesse, float temperature) {
		super();
		this.statut = statut;
		this.vitesse = vitesse;
		this.temperature = temperature;
	}

		private String statut; 
	    private int vitesse;
	    float temperature;
	    
	    public void verifieTemperature(){
	    if(temperature>660){ 
	    statut="Retour au bercail";
	    	}
	    }
	    
	    public void montreAttributs(){
	    System.out.println("Statut : "+statut);
	    System.out.println("Vitesse : "+vitesse);
	    System.out.println("Temperature : "+temperature); }
	    
	    public String getStatut() {
	        return statut;
	    }
	    
	    public void setStatut(String statut) {
	        this.statut = statut;
	    }
	    
	    public int getVitesse() {
	        return vitesse;
	    }
	    
	    public void setVitesse(int vitesse) {
	        this.vitesse = vitesse;
	    }
	    
	    public float getTemperature() {
	        return temperature;
	    }
	    
	    public void setTemperature(float temperature) {
	        this.temperature = temperature;
	    }
	    
	    public void farToCel(){
	    	temperature = (float) ((temperature - 32) / 1.8) ;

	    }
   }