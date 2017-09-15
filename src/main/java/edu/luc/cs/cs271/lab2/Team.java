package edu.luc.cs.cs271.lab2;

/** A sports team. */
public class Team {
  /** The team's name. */
  private String name;

  /** The team's head coach. */
  private String headcoach;

  /** The team's monetary funding level in thousands of US$. */
  private int funding;

  /** Constructs a new team. */
  public Team(final String name, final String headcoach, final int funding) {
    if (name == null || headcoach == null || funding == int(null)) {
      throw new IllegalArgumentException("There is a null value");
    }
    // TODO validity checking for headcoach RESOLVED see line 16
    // TODO validity checking for funding RESOLVED see line 16

    this.name = name;
    // TODO complete this constructor RESOLVED see below
    this.headcoach = headcoach;
    this.funding = funding;
  }

  /** Returns the team's name. */
  public String getName() {
    return this.name;
  }

  /** Returns the team's head coach. */
  public String getHeadcoach() {
    // TODO complete this method
    if(this.headcoach == null){
      return null;
    }
    else
    {
      return this.headcoach;
    }
    
  }

  /** Returns the team's funding level. */
  public int getFunding() {
    // TODO complete this method
    return -1;
  }
}
