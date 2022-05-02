package problema14.template;

public abstract class MijlocTransportPeSine {
	protected abstract void opresteStatie1();
	protected abstract void opresteStatie2();
	protected abstract void opresteStatie3();
	
	public final void parcurgeTraseuInSensNormal() {
		opresteStatie1();
		opresteStatie2();
		opresteStatie3();
	}

	public final void parcurgeTraseuInSensInvers() {
		opresteStatie3();
		opresteStatie2();
		opresteStatie1();
	}
}
