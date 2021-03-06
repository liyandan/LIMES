package org.aksw.limes.core.measures.measure.phoneticmeasure;

import org.aksw.limes.core.io.cache.Instance;
import org.aksw.limes.core.measures.measure.string.StringMeasure;

public class MatchRatingApproachEncoderMeasure  extends StringMeasure {

	//public static final int codeLength = 6;

	public static String getCode(String string) {
		
	string=string.toUpperCase();
		MatchRatingApproachEncoder matchratingapproachencoder = new MatchRatingApproachEncoder();
		string=string.replaceAll("[^\\p{ASCII}]", "");
		string=string.replaceAll("[^a-zA-Z0-9]", "");
		return matchratingapproachencoder.encode(string);
		
	}

	public double proximity(String s1, String s2) {
		char[] c1, c2;
		c1 = getCode(s1).toCharArray();
		c2 = getCode(s2).toCharArray();
		double distance = 0d;
		for (int i = 0; i < c1.length; i++)
			if (c1[i] != c2[i])
				distance += 1d;
		return (1.0d - (distance / (double) c1.length));
	}

	@Override
	public int getPrefixLength(int tokensNumber, double threshold) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getMidLength(int tokensNumber, double threshold) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public double getSizeFilteringThreshold(int tokensNumber, double threshold) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getAlpha(int xTokensNumber, int yTokensNumber, double threshold) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public double getSimilarity(int overlap, int lengthA, int lengthB) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean computableViaOverlap() {
		return false;
	}

	@Override
	public double getSimilarity(Object object1, Object object2) {
		return proximity(object1.toString(), object2.toString());
	}

	@Override
	public String getType() {
		return "string";
	}

	@Override
	public double getSimilarity(Instance instance1, Instance instance2, String property1, String property2) {
		double max = 0;
		double sim = 0;
		for (String source : instance1.getProperty(property1)) {
			for (String target : instance2.getProperty(property2)) {
				sim = proximity(source, target);
				if (sim > max) {
					max = sim;
				}
			}
		}
		return max;
	}

	@Override
	public String getName() {
		return "match rating";
	}

	@Override
	public double getRuntimeApproximation(double mappingSize) {
		return mappingSize / 1000d;
	}

}

