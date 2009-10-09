package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;

/**
* Protege name: Adapt
* @author ontology bean generator
* @version 2009/10/7, 18:01:55
*/
public interface Adapt extends jade.content.AgentAction, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

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

   /**
   * Protege name: to
   */
   public void setTo(Problem value);
   public Problem getTo();

}
