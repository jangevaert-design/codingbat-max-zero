package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatMaxZero.zeroMax;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatMaxZeroTest {

  private int[][] zeroParams = {
      {0, 5, 0, 3},
      {0, 4, 0, 3},
      {0, 1, 0},
      {0, 1, 5},
      {0, 2, 0},
      {1},
      {0},
      {},
      {7, 0, 4, 3, 0, 2},
      {7, 0, 4, 3, 0, 1},
      {7, 0, 4, 3, 0, 0},
      {7, 0, 1, 0, 0, 7}
  };

  private int[][] zeroExpected = {
      {5, 5, 3, 3},
      {3, 4, 3, 3},
      {1, 1, 0},
      {5, 1, 5},
      {0, 2, 0},
      {1},
      {0},
      {},
      {7, 3, 4, 3, 0, 2},
      {7, 3, 4, 3, 1, 1},
      {7, 3, 4, 3, 0, 0},
      {7, 7, 1, 7, 7, 7}

  };

  @Test
  void zeroTest() {
    for (int i = 0; i < zeroParams.length; i++) {
      String actual = Arrays.toString(zeroMax(zeroParams[i]));
      Assertions.assertEquals(actual, Arrays.toString(zeroExpected[i]));
    }
  }

}