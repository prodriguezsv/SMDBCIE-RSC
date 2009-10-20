package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Solution
* @author ontology bean generator
* @version 2009/10/17, 19:00:45
*/
public interface Solution extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: justification
   */
   public void setJustification(Description value);
   public Description getJustification();

   /**
   * Protege name: name
   */
   public void setName(String value);
   public String getName();

   /**
   * Protege name: rank
   */
   public void setRank(String value);
   public String getRank();

}
