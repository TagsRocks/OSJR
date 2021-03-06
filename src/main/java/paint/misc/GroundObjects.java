package paint.misc;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import cache.TileListener;
import game.Game;
import game.Settings;
import hooks.Hooks;
import hooks.accessors.Client;
import hooks.accessors.GroundObject;
import hooks.helpers.LocalPoint;
import hooks.helpers.Perspective;
import hooks.helpers.Point;
import paint.PaintListener;

public class GroundObjects implements PaintListener {

	public GroundObjects(Client game) {
	}

	@Override
	public void onRepaint(Graphics g) {
		g.setColor(Color.yellow);
		if (Settings.SHOW_GROUNDOBJECT_IDS && Game.ctrlPressed==false)
			if (Hooks.client != null)
				if (Hooks.client.isLoggedIn()) {
					for (GroundObject go : TileListener.groundObjects.values()) {
						if (go != null) {
							String name = "" + go.getID() + "p: " + go.getPlane() + " x:" + go.getX() + " y:"
									+ go.getY();
							Point p = Perspective.getCanvasTextLocation(Hooks.client, (Graphics2D) g,
									new LocalPoint(go.getX(), go.getY()), name, 0);
							if (p != null && name != null && name.compareTo("null") != 0)
								g.drawString(name, p.getX(), p.getY());
						}
					}
				}

	}

}
