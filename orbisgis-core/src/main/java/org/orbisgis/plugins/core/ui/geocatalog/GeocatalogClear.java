
/*
 * OrbisGIS is a GIS application dedicated to scientific spatial simulation.
 * This cross-platform GIS is developed at French IRSTV institute and is able
 * to manipulate and create vector and raster spatial information. OrbisGIS
 * is distributed under GPL 3 license. It is produced  by the geo-informatic team of
 * the IRSTV Institute <http://www.irstv.cnrs.fr/>, CNRS FR 2488:
 *    Erwan BOCHER, scientific researcher,
 *    Thomas LEDUC, scientific researcher,
 *    Fernando GONZALEZ CORTES, computer engineer.
 *
 * Copyright (C) 2009 Erwan BOCHER, Pierre-yves FADET
 *
 * This file is part of OrbisGIS.
 *
 * OrbisGIS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OrbisGIS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OrbisGIS. If not, see <http://www.gnu.org/licenses/>.
 *
 * For more information, please consult:
 *    <http://orbisgis.cerma.archi.fr/>
 *    <http://sourcesup.cru.fr/projects/orbisgis/>
 *
 * or contact directly:
 *    erwan.bocher _at_ ec-nantes.fr
 *    Pierre-Yves.Fadet_at_ec-nantes.fr
 *    thomas.leduc _at_ cerma.archi.fr
 */

package org.orbisgis.plugins.core.ui.geocatalog;

import java.io.IOException;
import java.util.Observable;

import javax.swing.JOptionPane;

import org.gdms.source.SourceManager;
import org.orbisgis.core.Services;
import org.orbisgis.plugins.core.ui.AbstractPlugIn;
import org.orbisgis.plugins.core.ui.PlugInContext;
import org.orbisgis.plugins.core.ui.workbench.WorkbenchContext;
import org.orbisgis.plugins.core.ui.workbench.WorkbenchFrame;

public class GeocatalogClear extends AbstractPlugIn {
	
	public boolean execute(PlugInContext context) throws Exception {
		getUpdateFactory().executeGeocatalog();
		return true;
	}
	
	public void initialize(PlugInContext context) throws Exception {
		WorkbenchContext wbContext = context.getWorkbenchContext();
		WorkbenchFrame frame = wbContext.getWorkbench().getFrame().getGeocatalog();
		context.getFeatureInstaller().addPopupMenuItem(frame, this,
				new String[] { "Clear catalog" }, "geocatalog.global", false,
				getIcon("bin_closed.png"), wbContext);		
	}
	
	public void update(Observable o, Object arg) {}	

	public void execute(SourceManager sourceManager, String currentNode) {
		int option = JOptionPane.showConfirmDialog(null, "This will clear all "
				+ "resources and their associated layers. Continue?",
				"Clear catalog", JOptionPane.YES_NO_OPTION,
				JOptionPane.WARNING_MESSAGE);
		if (option == JOptionPane.YES_OPTION) {
			try {
				sourceManager.removeAll();
			} catch (IOException e) {
				Services.getErrorManager().error("Cannot clear catalog", e);
			}
		}
	}
	
	public boolean isEnabled() {
		return true;
	}

	public boolean isVisible() {
		return getUpdateFactory().geocatalogIsVisible();
	}
	
	public boolean accepts(SourceManager sourceManager, String currentNode) {
		return true;
	}

	public boolean acceptsSelectionCount(int selectionCount) {
		return true;
	}
}
