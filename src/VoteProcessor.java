import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		HashMap<String, Integer> voters = new HashMap<>();
		for (String string : votes) {
			string = string.toLowerCase();
			System.out.println(string);
		}
		for (String string : votes) {
			if (!voters.containsKey(string)) {
				voters.put(string, 1);
			} else {
				voters.put(string, voters.get(string) + 1);
			}
		}
		String mostVoter = null;
		int mostvotes = 0;
		for (String string : voters.keySet()) {
			if (voters.get(string) > mostvotes) {
				mostvotes = voters.get(string);
				mostVoter = string;
			}
		}
		return mostVoter;
	}

}
