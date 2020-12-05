package model;

public class Lineups {
	private String date;
	private String tatic;
	private Players [][] training;

	/**
	 * @param date
	 * @param tatic
	 * @param training
	 */
	public Lineups(String date, String tatic, Players[][] training) {
		super();
		this.date = date;
		this.tatic = tatic;
		training = new Players [10][7];
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the tatic
	 */
	public String getTatic() {
		return tatic;
	}

	/**
	 * @param tatic the tatic to set
	 */
	public void setTatic(String tatic) {
		this.tatic = tatic;
	}

	/**
	 * @return the training
	 */
	public Players[][] getTraining() {
		return training;
	}

	/**
	 * @param training the training to set
	 */
	public void setTraining(Players[][] training) {
		this.training = training;
	}

	

}
