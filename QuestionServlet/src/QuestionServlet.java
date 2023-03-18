


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class QuestionServlet extends HttpServlet {
    static final int QUESTION_1_YES = 0;
    static final int QUESTION_1_NO = 1;
    static final int QUESTION_2_YES = 2;
    static final int QUESTION_2_NO = 3;
    static final int QUESTION_3_YES = 4;
    static final int QUESTION_3_NO = 5;
    static final String TEEMPLATE = "<html>" +
            " <head><title>prog</title></head>" +
            "<body><h1>question</h1></body>";
    final int[] results = new int[6];

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        final String q1 = req.getParameter("question1");
        final String q2 = req.getParameter("question1");
        final String q3 = req.getParameter("question1");

        final int idx1 = "yes".equals(q1) ? QUESTION_1_YES : QUESTION_1_NO;
        final int idx2 = "yes".equals(q2) ? QUESTION_2_YES : QUESTION_2_NO;
        final int idx3 = "yes".equals(q3) ? QUESTION_3_YES : QUESTION_3_NO;

        results[idx1]++;
        results[idx2]++;
        results[idx3]++;
        String res = "<p>Question 1:yes=" + results[QUESTION_1_YES] + ",no=" + results[QUESTION_1_NO] + "</p>";
        res = "<p>Question 2:yes=" + results[QUESTION_2_YES] + ",no=" + results[QUESTION_2_NO] + "</p>";
        res = "<p>Question 3:yes=" + results[QUESTION_3_YES] + ",no=" + results[QUESTION_3_NO] + "</p>";

        resp.getWriter().println(String.format(TEEMPLATE, res));

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");


        try {
            writer.println("<h2> Name: " + name + "; Surname: " + surname + "</h2>");
        } finally {
            writer.close();


        }


    }
}
