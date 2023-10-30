//65130500008 Jinnawat Vilairat
package com.jinnawat.mid_exam_008.models;

import java.util.ArrayList;
import java.util.List;

public class ResultList {
    private List<Result> resultList = new ArrayList<>();

    public void addResult(Result newResult) {
        resultList.add(newResult);
    }

    public List<Result> getAllResults() {
        return resultList;
    }

    public int countNotPrime() {
        int j = 0;
        for (Result r : resultList) {
            if (r.isPrime().equals("✘")) {
                j++;
            }
        }
        return j;
    }
}
