package test;

import org.apache.commons.math3.filter.DefaultMeasurementModel;
import org.apache.commons.math3.filter.DefaultProcessModel;
import org.apache.commons.math3.filter.KalmanFilter;
import org.apache.commons.math3.filter.MeasurementModel;
import org.apache.commons.math3.filter.ProcessModel;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class kalmenfilter {
	double constantVoltage = 10d;
	double measurementNoise = 0.1d;
	double processNoise = 1e-5d;

	// A = [ 1 ]
	RealMatrix A = new Array2DRowRealMatrix(new double[] { 1d });
	// B = null
	RealMatrix B = null;
	// H = [ 1 ]
	RealMatrix H = new Array2DRowRealMatrix(new double[] { 1d });
	// x = [ 10 ]
	RealVector x = new ArrayRealVector(new double[] { constantVoltage });
	// Q = [ 1e-5 ]
	RealMatrix Q = new Array2DRowRealMatrix(new double[] { processNoise });
	// P = [ 1 ]
	RealMatrix P0 = new Array2DRowRealMatrix(new double[] { 1d });
	// R = [ 0.1 ]
	RealMatrix R = new Array2DRowRealMatrix(new double[] { measurementNoise });

	ProcessModel pm = new DefaultProcessModel(A, B, Q, x, P0);
	MeasurementModel mm = new DefaultMeasurementModel(H, R);
	KalmanFilter filter = new KalmanFilter(pm, mm);  

	// process and measurement noise vectors
	RealVector pNoise = new ArrayRealVector(1);
	RealVector mNoise = new ArrayRealVector(1);


}
