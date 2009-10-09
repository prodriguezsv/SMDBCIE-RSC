package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Case
* @author ontology bean generator
* @version 2009/10/7, 18:01:54
*/
public interface Case extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: solution
   */
   public void setSolution(Solution value);
   public Solution getSolution();

   /**
   * Protege name: state
   */
   public void setState(boolean value);
   public boolean getState();

   /**
   * Protege name: problem
   */
   public void setProblem(Problem value);
   public Problem getProblem();

}
