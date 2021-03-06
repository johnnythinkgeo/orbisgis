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
 * Copyright (C) 2007 Erwan BOCHER, Fernando GONZALEZ CORTES, Thomas LEDUC
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
 *    fergonco _at_ gmail.com
 *    thomas.leduc _at_ cerma.archi.fr
 */
package org.gdms.sql.function.spatial.io;

import org.gdms.data.types.Type;
import org.gdms.data.values.ValueFactory;
import org.gdms.sql.FunctionTest;
import org.gdms.sql.function.spatial.geometry.io.AsWKT;
import org.gdms.sql.function.spatial.geometry.io.GeomFromText;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.io.WKTWriter;

public class IOSpatialFunctionTest extends FunctionTest {

	public void testAsWKT() throws Exception {
		String str = testSpatialFunction(new AsWKT(), g1, 1).getAsString();
		assertTrue(str.equals(new WKTWriter().write(g1)));
		Point p3d = new GeometryFactory().createPoint(new Coordinate(3, 3, 3));
		str = testSpatialFunction(new AsWKT(), p3d, 1).getAsString();
		assertTrue(str.equals(new WKTWriter(3).write(p3d)));
	}

	public void testGeomFromText() throws Exception {
		String wkt = new WKTWriter().write(g1);
		Geometry g = testSpatialFunction(new GeomFromText(),
				ValueFactory.createValue(wkt), Type.STRING, 1).getAsGeometry();
		assertTrue(g.equals(g1));
		Point p3d = new GeometryFactory().createPoint(new Coordinate(3, 3, 3));
		wkt = new WKTWriter(3).write(p3d);
		g = testSpatialFunction(new GeomFromText(),
				ValueFactory.createValue(wkt), Type.STRING, 1).getAsGeometry();
		assertTrue(g.equals(p3d));
	}
}
