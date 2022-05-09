package builder_1.clase;

public class PacientBuilder implements Builder{

	private Pacient pacient;
	
	
	public PacientBuilder() {
		pacient=new Pacient(false, false, false, false);
	}


	@Override
	public Pacient build() {
		// TODO Auto-generated method stub
		return pacient;
	}
	
	
	public PacientBuilder setPatRabatabil(boolean isPatRabatabil) {
		this.pacient.setPatRabatabil(isPatRabatabil);
		return this;
	}
	public PacientBuilder setHasMicDejunInclus(boolean hasMicDejunInclus) {
		this.pacient.setHasMicDejunInclus(hasMicDejunInclus);
		return this;
	}
	public PacientBuilder setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
		this.pacient.setHasPapuciDeCamera(hasPapuciDeCamera);
		return this;
	}
	public PacientBuilder setHasHalatInterior(boolean hasHalatInterior) {
		this.pacient.setHasHalatInterior(hasHalatInterior);
		return this;
	}

}
