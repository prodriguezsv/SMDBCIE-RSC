package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Case
* @author ontology bean generator
* @version 2009/10/17, 19:00:45
*/
public interface Case extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: problem
   */
   public void setProblem(Problem value);
   public Problem getProblem();

   /**
   * Protege name: state
   */
   public void setState(boolean value);
   public boolean getState();

   /**
   * Protege name: solution
   */
   public void setSolution(Solution value);
   public Solution getSolution();

}
