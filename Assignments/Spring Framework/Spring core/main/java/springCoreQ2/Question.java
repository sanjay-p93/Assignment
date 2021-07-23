package springCoreQ2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionId;
	private String question;
	private List<String> answerList;
	private Map<Integer, String> answerMap;
	private Set<String> answerSet;

	public Question() {
	}

	public Question(int questionId, String question, List<String> answerList) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answerList = answerList;
	}

	public Question(int questionId, String question, Map<Integer, String> answerMap) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answerMap = answerMap;
	}

	public Question(int questionId, String question, Set<String> answerSet) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answerSet = answerSet;
	}

	public void dispaly() {

		System.out.println(questionId + " " + question);
		System.out.println("answers are:");

		if (answerList != null &&!answerList.isEmpty()) {
			answerList.stream().forEach(System.out::println);
		} else if (answerMap != null &&!answerMap.isEmpty()) {
			answerMap.entrySet().stream().forEach(System.out::println);
		} else if (answerSet != null &&!answerSet.isEmpty()) {
			answerMap.entrySet().stream().forEach(System.out::println);
		}
	}

	public int getQuestionId() {
		return questionId;
	}

	public String getQuestion() {
		return question;
	}

	public List<String> getAnswerList() {
		return answerList;
	}

	public Map<Integer, String> getAnswerMap() {
		return answerMap;
	}

	public Set<String> getAnswerSet() {
		return answerSet;
	}
}
