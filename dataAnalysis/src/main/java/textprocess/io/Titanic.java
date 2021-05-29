package textprocess.io;

public class Titanic {
	private int PassengerId;
	private boolean Survived;
	private String Pclass;
	private String Name;
	private String Sex;
	private int Age;
	private Double SibSp;
	private Double Parch;
	private Double Ticket;
	private Double Fare;
	private Double Cabin;
	private String Embarked;
	public Titanic( int m_PassengerId,boolean m_Survived,String m_Pclass,
				  String m_Name,String m_Sex,int m_Age,Double m_SibSp,Double m_Parch,Double 
				  m_Ticket,Double m_Fare,Double m_Cabin,String m_Embarked) {

		PassengerId = m_PassengerId;
		Survived = m_Survived;
		Pclass = m_Pclass;
		Name = m_Name;
		Sex = m_Sex;
		Age = m_Age;
		SibSp = m_SibSp;
		Parch = m_Parch;
		Ticket = m_Ticket;
		Fare = m_Fare;
		Cabin = m_Cabin;
		Embarked = m_Embarked;
	}
	public int getPassengerId() {
		return PassengerId;
	}
	public void setPassengerId(int passengerId) {
		PassengerId = passengerId;
	}
	public String getPclass() {
		return Pclass;
	}
	public void setPclass(String pclass) {
		Pclass = pclass;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public boolean isSurvived() {
		return Survived;
	}
	public void setSurvived(boolean survived) {
		Survived = survived;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public Double getCabin() {
		return Cabin;
	}
	public void setCabin(Double cabin) {
		Cabin = cabin;
	}
	public Double getSibSp() {
		return SibSp;
	}
	public void setSibSp(Double sibSp) {
		SibSp = sibSp;
	}
	public Double getParch() {
		return Parch;
	}
	public void setParch(Double parch) {
		Parch = parch;
	}
	public Double getTicket() {
		return Ticket;
	}
	public void setTicket(Double ticket) {
		Ticket = ticket;
	}
	public Double getFare() {
		return Fare;
	}
	public void setFare(Double fare) {
		Fare = fare;
	}
	public String getEmbarked() {
		return Embarked;
	}
	public void setEmbarked(String embarked) {
		Embarked = embarked;
	}
}
