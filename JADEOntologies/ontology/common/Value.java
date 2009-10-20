package ontology.common;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;

/**
* Protege name: Value
* @author ontology bean generator
* @version 2009/10/17, 11:59:53
*/
public interface Value extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: measuringUnit
   */
   public void setMeasuringUnit(String value);
   public String getMeasuringUnit();

   /**
   * Protege name: describes
   */
   public void addDescribes(Attribute elem);
   public boolean removeDescribes(Attribute elem);
   public void clearAllDescribes();
   public Iterator getAllDescribes();
   public List getDescribes();
   public void setDescribes(List l);

}
