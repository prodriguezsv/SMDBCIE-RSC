package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Resolve
* @author ontology bean generator
* @version 2009/10/17, 19:00:46
*/
public interface Resolve extends jade.content.AgentAction, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: problem
   */
   public void setProblem(Problem value);
   public Problem getProblem();

}
