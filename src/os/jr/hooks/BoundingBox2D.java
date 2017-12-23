package os.jr.hooks;

public class BoundingBox2D extends BoundingBox {

	public static final String plane = "plane";
	public static final String xMin = "xMin";
	public static final String yMin = "yMin";
	public static final String xMax = "xMax";
	public static final String yMax = "yMax";
	public static final String color = "color";

	public BoundingBox2D() {
		super(Hooks.classNames.get("BoundingBox2D"));
	}

	public int getColor() {
		return (int) getField(color).getValue(reference);
	}

	public int getPlane() {
		return (int) getField(plane).getValue(reference);
	}

	public int getxMax() {
		return (int) getField(xMax).getValue(reference);
	}

	public int getxMin() {
		return (int) getField(xMin).getValue(reference);
	}

	public int getyMax() {
		return (int) getField(yMax).getValue(reference);
	}

	public int getyMin() {
		return (int) getField(yMin).getValue(reference);
	}

}
