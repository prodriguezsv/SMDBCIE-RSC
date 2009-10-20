package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;

/**
* Protege name: Hypothesis
* @author ontology bean generator
* @version 2009/10/17, 19:00:45
*/
public interface Hypothesis extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: justification
   */
   public void setJustification(Description value);
   public Description getJustification();

   /**
   * Protege name: description
   */
   public void setDescription(Description value);
   public Description getDescription();

   /**
   * Protege name: possibleSolutions
   */
   public void addPossibleSolutions(PossibleSolution elem);
   public boolean removePossibleSolutions(PossibleSolution elem);
   public void clearAllPossibleSolutions();
   public Iterator getAllPossibleSolutions();
   public List getPossibleSolutions();
   public void setPossibleSolutions(List l);

   /**
   * Protege name: unmatchedDescription
   */
   public void setUnmatchedDescription(Description value);
   public Description getUnmatchedDescription();

}
