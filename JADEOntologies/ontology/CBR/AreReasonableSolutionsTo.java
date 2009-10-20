package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;

/**
* Protege name: AreReasonableSolutionsTo
* @author ontology bean generator
* @version 2009/10/17, 19:00:46
*/
public interface AreReasonableSolutionsTo extends jade.content.Predicate, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: problem
   */
   public void setProblem(Problem value);
   public Problem getProblem();

   /**
   * Protege name: proposedSolutions
   */
   public void addProposedSolutions(ProposedSolution elem);
   public boolean removeProposedSolutions(ProposedSolution elem);
   public void clearAllProposedSolutions();
   public Iterator getAllProposedSolutions();
   public List getProposedSolutions();
   public void setProposedSolutions(List l);

}
