package edu.cmu.lti.bic.sbs.evaluator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/**
 * 
 * @author victorzhao, xings
 *
 */
public class Path extends ArrayList<Step> {
	String tag = ""; // tag the type of this path: goldStandard or actual

	/**
	 * The method that use to calculate the score between two paths.
	 * @param p2 real path
	 * @return score
	 */
	public double pathScore(Path p2) throws NullPointerException {
		// Required this and p2
	    	double pScore;
	    	Iterator<Step> itrThis;
	    	Iterator<Step> itrP2;
	    	try {
	    	    itrThis = this.iterator();
	    	    itrP2 = p2.iterator();
	    	}
	    	catch (NullPointerException e) {
	    	    throw new NullPointerException();
	    	}
	    	while (itrP2.hasNext() && itrThis.hasNext()) {
	    	    pScore += itrThis.next().stepScore(itrP2.next());
	    	}
		return pScore;
	}
	
	public void setTag(String tag){
	  this.tag = tag;
	}
	
	public String getTag(){
	  return this.tag;
	}
	
	public static void main(String[] args) {
		Path p = new Path();
		p.pathScore(new Path());
		// TODO: Test scoring function locally inside Path class.
		
	}
	
}
