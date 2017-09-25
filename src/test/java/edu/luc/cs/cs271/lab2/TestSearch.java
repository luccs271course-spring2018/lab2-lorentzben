package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Optional;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }
  
    ArrayList<Team> makeListFixture(final int size){
    final ArrayList<Team> list = new ArrayList<Team>(size);
    
    for(int i = 0; i < size; i++)
    {
      final String s = Integer.toString(i);
      list.add(i, new Team("Team " + s,"Coach " + s, i * 100 + 50));
    }
    return list;
  }

  // TODO makeListFixture

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  // TODO: testFindPositionList0, 10s, 10f
  @Test
  public void testFindPositionList0()
  {
    final ArrayList<Team> list = makeListFixture(0);
    assertFalse(Search.findTeamPosition(list, "Team 4").isPresent());
  }
  
  @Test
  public void testFindPositionList10s()
  {
    final ArrayList<Team> list = makeListFixture(10);
    assertFalse(Search.findTeamPosition(list, "Team 5").isPresent());
    //we talked over this
  }
  
  @Test
  public void testFindPositionList10f()
  {
    final ArrayList<Team> list = makeListFixture(0);
    assertFalse(Search.findTeamPosition(list, "Team 11").isPresent());
  }
  // TODO: testFindMinFundingArray for several sizes and scenarios
  
  @Test
  public void testFindMinFundingArray0()
  {
    final Team[] arr = makeArrayFixture(2);
    assertFalse(Search.findTeamMinFunding(arr, 600).isPresent());
  }
  
  @Test
  public void testFindMinFundingArray10s()
  {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamMinFunding(arr, 950).isPresent());
  }
  
  @Test
  public void testFindMinFundingArray10f()
  {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamMinFunding(arr, 2000).isPresent());
  }
  
  // TODO: testFindMinFundingArrayFast for several sizes and scenarios
  
  @Test
  public void testFindMinFundingArrayFast0()
  {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamMinFundingFast(arr, 2000).isPresent());
  }
  
  @Test
  public void testFindMinFundingArrayFast10s()
  {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamMinFundingFast(arr, 950).isPresent());
  }
  
  @Test
  public void testFindMinFundingArrayFast10f()
  {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamMinFundingFast(arr, 2000).isPresent());
  }
  
}
