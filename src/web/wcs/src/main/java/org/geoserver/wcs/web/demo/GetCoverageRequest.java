package org.geoserver.wcs.web.demo;

import java.awt.geom.AffineTransform;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.geotools.coverage.grid.GridEnvelope2D;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.opengis.referencing.crs.CoordinateReferenceSystem;

/**
 * A simple model backing the WCS GetCoverage builder GUI
 * 
 * @author Andrea Aime - GeoSolutions
 * 
 */
class GetCoverageRequest implements Serializable {
    private static final long serialVersionUID = -1473018934663380028L;

    static final List<String> FORMATS = Arrays.asList("GeoTIFF", "ArcGrid", "TIFF", "GIF", "BMP",
            "PNG", "JPEG", "Text debug grid");
    
    enum Version {
        v1_0_0("1.0.0"), v1_1_1("1.1.1");
        
        String name;

        Version(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    };

    Version version = Version.v1_0_0;

    String coverage;

    ReferencedEnvelope bounds;

    CoordinateReferenceSystem targetCRS;

    AffineTransform targetGridToWorld;

    GridEnvelope2D sourceGridRange;

    List<String> bands;

    String outputFormat = "GeoTIFF";
}