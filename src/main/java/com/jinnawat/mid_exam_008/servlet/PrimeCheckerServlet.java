//65130500008 Jinnawat Vilairat
package com.jinnawat.mid_exam_008.servlet;

import com.jinnawat.mid_exam_008.models.Result;
import com.jinnawat.mid_exam_008.models.ResultList;
import com.jinnawat.mid_exam_008.models.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.eclipse.tags.shaded.org.apache.regexp.RE;

import java.io.*;

@WebServlet(name = "PrimeCheckerServlet", value = "/008/PrimeCheckerServlet")
public class PrimeCheckerServlet extends HttpServlet {
    int id = 1;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        ResultList resultList = (ResultList) session.getAttribute("resultList");
        session.setAttribute("displayResult", "");

        if (resultList == null) {
            resultList = new ResultList();
            session.setAttribute("resultList", resultList);
        }

        String stringNum = req.getParameter("num");
        if (regex(stringNum)) {
            session.setAttribute("displayResult", stringNum + " is invalid input!!!");
            resp.sendRedirect("is_prime.jsp");
        } else if (stringNum.isEmpty()) {
            session.setAttribute("displayResult", "Empty is invalid input!!!");
            resp.sendRedirect("is_prime.jsp");
        } else {
            int numToCheck = Integer.parseInt(req.getParameter("num"));

            if (numToCheck < 0) {
                session.setAttribute("displayResult", numToCheck + " is invalid input!!!");
            }

            if (isPrimeNumber(numToCheck)) {
                session.setAttribute("displayResult", numToCheck + " is prime number!");
            } else {
                session.setAttribute("displayResult", numToCheck + " is not prime number!");
            }
            boolean result = isPrimeNumber(numToCheck);
            Result resultNew = new Result(id++, numToCheck, result);
            resultList.addResult(resultNew);
            session.setAttribute("count", resultList.countNotPrime());
            session.setAttribute("resultList", resultList);
            resp.sendRedirect("is_prime.jsp");
        }
    }

    private static boolean isPrimeNumber(int num) { //REF: https://gist.github.com/madan712/8663442
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean regex(String str) { //REF: https://www.geeksforgeeks.org/different-ways-to-remove-all-the-digits-from-string-in-java/
        char[] charArray = str.toCharArray();
        String result = "";

        for (char c : charArray) {
            if (!Character.isDigit(c)) {
                result = result + c;
            }
        }

        return !result.isEmpty();
    }
}
 
