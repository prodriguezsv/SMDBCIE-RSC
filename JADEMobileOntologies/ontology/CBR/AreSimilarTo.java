package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* Protege name: AreSimilarTo
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface AreSimilarTo extends jade.content.Predicate, Introspectable {

   /**
   * Protege name: problem
   */
   public void setProblem(Problem value);
   public Problem getProblem();

   /**
   * Protege name: successfulConflictSet
   */
   public void addSuccessfulConflictSet(Hypothesis elem);
   public boolean removeSuccessfulConflictSet(Hypothesis elem);
   public void clearAllSuccessfulConflictSet();
   public Iterator getAllSuccessfulConflictSet();
   public List getSuccessfulConflictSet();
   public void setSuccessfulConflictSet(List l);

   /**
   * Protege name: failureConflictSet
   */
   public void addFailureConflictSet(Hypothesis elem);
   public boolean removeFailureConflictSet(Hypothesis elem);
   public void clearAllFailureConflictSet();
   public Iterator getAllFailureConflictSet();
   public List getFailureConflictSet();
   public void setFailureConflictSet(List l);

}
