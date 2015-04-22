package grader.model.gradebook;

import grader.model.file.WorkSpace;
import grader.model.items.AssignmentTree;
import grader.model.people.Student;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * The Spreadsheet class represents the underlying model for the grade spreadsheet.
 *
 * @author Gregory Davis
 */
public class Spreadsheet implements Observer {
   private AssignmentTree assignmentTree;
   private List<Student> students;
   private Scores scores;

   /**
    * Renders the scores spreadsheet to the view.
    */
   public void render() {}

   /**
    * Updates the spreadsheet's context assignment tree, students, and scores.
    */
   public void update(Observable obj, Object args) {
      assignmentTree = WorkSpace.instance.getAssignmentTree();
      students = WorkSpace.instance.getStudents();
      scores = WorkSpace.instance.getScores();
      render();
   }
}
