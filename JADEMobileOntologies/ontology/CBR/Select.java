package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* Protege name: Select
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface Select extends jade.content.AgentAction, Introspectable {

   /**
   * Protege name: to
   */
   public void setTo(Problem value);
   public Problem getTo();

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
