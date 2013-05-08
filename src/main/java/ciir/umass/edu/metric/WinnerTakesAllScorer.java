package ciir.umass.edu.metric;

import ciir.umass.edu.learning.RankList;

/**
 * 
 * @author Julien Subercaze <julien.subercaze@telecom-st-etienne.fr> &
 *         Christophe Gravier <christophe.gravier@telecom-st-etienne.fr>
 * 
 */
public class WinnerTakesAllScorer extends MetricScorer {
	protected int k = 10;

	public WinnerTakesAllScorer() {

	}

	public void setK(int k) {
		this.k = k;
	}

	/**
	 * Score a RankList by given a score of 1.0 if they have the same most
	 * relevant item, 0.0 otherwise (Winner take all !)
	 * 
	 * @param rl
	 *            a Ranked List of item
	 * @return score for the model on this RankList, in this metric this is
	 *         <ul>
	 *         <li>1.0 if the most relevant item in both correct RankList and
	 *         predicted RankList are the same</li>
	 *         <li>0.0 otherwise</li>
	 *         </ul>
	 */
	public double score(RankList rl) {
		return rl.getCorrectRanking().get(0).getID().equals(rl.get(0).getID()) ? 1.0 : 0.0;
	}

	public WinnerTakesAllScorer clone() {
		return null;
	}

	public String name() {
		return "WinnerTakesAll";
	}

	public double[][] swapChange(RankList rl) {
		return null;
	}
}
