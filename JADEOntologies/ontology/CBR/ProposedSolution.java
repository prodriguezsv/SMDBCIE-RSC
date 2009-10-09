package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: ProposedSolution
* @author ontology bean generator
* @version 2009/10/7, 18:01:54
*/
public interface ProposedSolution extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: certaintyDegree
   */
   public void setCertaintyDegree(String value);
   public String getCertaintyDegree();

   /**
   * Protege name: evaluatedSolution
   */
   public void setEvaluatedSolution(PossibleSolution value);
   public PossibleSolution getEvaluatedSolution();

   /**
   * Protege name: state
   */
   public void setState(boolean value);
   public boolean getState();

}
