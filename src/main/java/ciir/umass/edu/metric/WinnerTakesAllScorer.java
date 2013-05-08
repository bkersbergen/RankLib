package ciir.umass.edu.metric;

import ciir.umass.edu.learning.RankList;

/**
 * 
 * @author Julien Subercaze <julien.subercaze@telecom-st-etienne.fr> &
 *         Christophe Gravier <christophe.gravier@telecom-st-etienne.fr>
 * 
 */
public class WinnerTakesAllScorer extends MetricScorer {

	public WinnerTakesAllScorer() {

	}

	/**
	 * Score a RankList by given a score of 1.0 if they have the same most
	 * relevant item, 0.0 otherwise (Winner take all !)
	 * 
	 * @param predictedList
	 *            a Ranked List of item
	 * @return score for the model on this RankList, in this metric this is
	 *         <ul>
	 *         <li>1.0 if the most relevant item in both correct RankList and
	 *         predicted RankList are the same</li>
	 *         <li>0.0 otherwise</li>
	 *         </ul>
	 */
	public double score(RankList predictedList) {
		RankList correctList = predictedList.getCorrectRanking();
		float correctLabel = correctList.get(0).getLabel();
		float predictedLabel = predictedList.get(0).getLabel();
		
		return (correctLabel == predictedLabel) ? 1.0 : 0.0;
	}

	public WinnerTakesAllScorer clone() {
		return new WinnerTakesAllScorer();
	}

	public String name() {
		return "WinnerTakesAll";
	}

	public double[][] swapChange(RankList rl) {
		return null;
	}
}
