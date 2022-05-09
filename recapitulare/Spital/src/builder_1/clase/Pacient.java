package builder_1.clase;

public class Pacient {

	
	private boolean isPatRabatabil;
	private boolean hasMicDejunInclus;
	private boolean hasPapuciDeCamera;
	private boolean hasHalatInterior;
	public Pacient(boolean isPatRabatabil, boolean hasMicDejunInclus, boolean hasPapuciDeCamera,
			boolean hasHalatInterior) {
		super();
		this.isPatRabatabil = isPatRabatabil;
		this.hasMicDejunInclus = hasMicDejunInclus;
		this.hasPapuciDeCamera = hasPapuciDeCamera;
		this.hasHalatInterior = hasHalatInterior;
	}
	public void setPatRabatabil(boolean isPatRabatabil) {
		this.isPatRabatabil = isPatRabatabil;
	}
	public void setHasMicDejunInclus(boolean hasMicDejunInclus) {
		this.hasMicDejunInclus = hasMicDejunInclus;
	}
	public void setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
		this.hasPapuciDeCamera = hasPapuciDeCamera;
	}
	public void setHasHalatInterior(boolean hasHalatInterior) {
		this.hasHalatInterior = hasHalatInterior;
	}
	@Override
	public String toString() {
		return "Pacient [isPatRabatabil=" + isPatRabatabil + ", hasMicDejunInclus=" + hasMicDejunInclus
				+ ", hasPapuciDeCamera=" + hasPapuciDeCamera + ", hasHalatInterior=" + hasHalatInterior + "]";
	}
	
	
	
	
}
