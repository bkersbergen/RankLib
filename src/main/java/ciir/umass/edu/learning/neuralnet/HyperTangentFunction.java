/*===============================================================================
 * Copyright (c) 2010-2012 University of Massachusetts.  All Rights Reserved.
 *
 * Use of the RankLib package is subject to the terms of the software license set 
 * forth in the LICENSE file included with this software, and also available at
 * http://people.cs.umass.edu/~vdang/ranklib_license.html
 *===============================================================================
 */

package ciir.umass.edu.learning.neuralnet;

/**
 * @author vdang
 */
public class HyperTangentFunction implements TransferFunction {

	public double compute(double x) {
		return (double) (1.7159 * Math.tanh(x*2/3));
	}

	public double computeDerivative(double x) {
		double output = Math.tanh(x*2/3);
		return (double) (1.7159 * (1.0 - output*output) * 2 /3);
	}

}