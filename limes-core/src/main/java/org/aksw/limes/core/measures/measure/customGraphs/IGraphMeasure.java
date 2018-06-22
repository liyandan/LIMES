package org.aksw.limes.core.measures.measure.customGraphs;

import org.aksw.limes.core.io.describe.IResourceDescriptor;
import org.aksw.limes.core.measures.measure.IMeasure;

/**
 * @author Cedric Richter
 */
public interface IGraphMeasure extends IMeasure {

    public double getSimilarity(IResourceDescriptor d1, IResourceDescriptor d2);

}