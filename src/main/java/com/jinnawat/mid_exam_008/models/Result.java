//65130500008 Jinnawat Vilairat
package com.jinnawat.mid_exam_008.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private int no;
    private int number;
    private boolean prime;

    public String isPrime() {
        if (prime) {
            return "✔";
        } else {
            return "✘";
        }
    }
}
