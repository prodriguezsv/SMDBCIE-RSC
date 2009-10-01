package ontology.taxonomy;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Modifier
* @author ontology bean generator
* @version 2009/09/30, 13:34:31
*/
public interface Modifier extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: attributeWeight
   */
   public void setAttributeWeight(float value);
   public float getAttributeWeight();

   /**
   * Protege name: structureWeight
   */
   public void setStructureWeight(float value);
   public float getStructureWeight();

   /**
   * Protege name: scoreWeight
   */
   public void setScoreWeight(float value);
   public float getScoreWeight();

}
