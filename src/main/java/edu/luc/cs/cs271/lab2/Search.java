package edu.luc.cs.cs271.lab2;

import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class Search {

  /** Looks for the position of the named team in an array. */
  public static Optional<Integer> findTeamPosition(final Team[] arr, final String key) {
    // Gets the array size
    final int size = arr.length;
    // Runs through a for loop to check
    for (int i = 0; i < size; i++) {
      // Gets the current item at index and compare name to key
      if (arr[i].getName().equals(key)) {
        // Return the index of where the item with key is located
        return Optional.of(i);
      }
    }
    // If it does not exist in the array then return an index of -1
    return Optional.empty();
  }

  /** Looks for the position of the named team in a list. */
  public static Optional<Integer> findTeamPosition(final List<Team> list, final String key) {
    // TODO complete this method RESOLVED? sure see below
    final int length = list.size();
    int index = 0;
    for(int i = 0; i < length; i++)
    {
      if(list.get(i).getName().equals(key))
      {
        return Optional.of(i);
      }
      else
      {
        return Optional.empty();
      }
    }return Optional.empty();
    
  }
  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && 
   * for all 0 <= i < result : arr[i].funding < minFunding
   */
  
  public static Optional<Integer> findTeamMinFunding(final Team[] arr, final int minFunding) {
    // TODO complete this method RESOLVED see below 
    int min = 0;
    int max = arr.length - 1;
    
    if(arr != null && minFunding >= arr[0].getFunding()){
      
      for(int i = 0; i <= max; i++)
      {
      if(minFunding == arr[i].getFunding())
      {
        return Optional.of(i);
      }
      else if(minFunding < arr[i].getFunding())
      {
        return Optional.of(i);
      }
      }return Optional.empty();
    }return Optional.empty();
  }
  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level. 
   * Uses binary search: Initially search the entire array, 
   * then repeatedly eliminate the wrong half of the array until 
   * zero or one items are left.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
   
  //TODO double check this returns a correct value
  public static Optional<Integer> findTeamMinFundingFast(final Team[] arr, final int minFunding) {
    // TODO complete this method
    // Gets the array size
    final int size = arr.length;
    // Initially search the entire array
    
    int min = 0;
    int max = size - 1;
    
    if(arr != null && minFunding != 0)
    {
      while(min < max)
      {
        int mid = (max + min)/2;
      if(minFunding <= arr[mid].getFunding())
      {
        max = mid;
      }
      else if(minFunding > arr[mid].getFunding())
      {
        min = mid+1;
      }
      else
      {
        return Optional.of(mid);
      }
  
      
      
    } 
    
    // Keep going as long as there is more than one item to be checked
    // Eliminate the wrong half of the array
    // Return current item only if it meets the condition!
    if (min <= max && arr[min].getFunding() >= minFunding) {
      return Optional.of(min);
    } else {
      return Optional.empty();
    }
  }
  return Optional.empty();
  }
}
