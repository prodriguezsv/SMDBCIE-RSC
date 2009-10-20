package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: IsTheMostReasonableTo
* @author ontology bean generator
* @version 2009/10/17, 19:00:46
*/
public interface IsTheMostReasonableTo extends jade.content.Predicate, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: problem
   */
   public void setProblem(Problem value);
   public Problem getProblem();

   /**
   * Protege name: proposedSolution
   */
   public void setProposedSolution(ProposedSolution value);
   public ProposedSolution getProposedSolution();

}
