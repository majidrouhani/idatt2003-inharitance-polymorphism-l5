package edu.ntnu.idatt2001.lectures.interfaces.samemethod;

public class Passenger implements Person, Pet {

  private String fullName;
  private String owner;
  private String gender;

  /**
   * @param fullName
   * @param gender
   */
  public Passenger(String fullName, String gender) {
    super();
    this.fullName = fullName;
    this.gender = gender;
  }

  /**
   * @param fullName
   * @param gender
   * @param owner
   */
  public Passenger(String fullName, String gender, String owner) {
    super();
    this.fullName = fullName;
    this.owner = owner;
    this.gender = gender;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  @Override
  public String getFullName() {
    return this.fullName;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  @Override
  public String getOwner() {
    return this.owner;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public String getGender() {
    return this.gender;
  }

  @Override
  public String toString() {
    String message = "Passenger [getFullName()=" + getFullName() + ", getGender()=" + getGender();

    if (getOwner() != null) {
      message += ", getOwner()=" + getOwner();
    }
    return message;
  }

}
