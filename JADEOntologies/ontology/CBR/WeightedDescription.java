package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;

/**
* Protege name: WeightedDescription
* @author ontology bean generator
* @version 2009/10/7, 18:01:55
*/
public interface WeightedDescription extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: weightedDescriptors
   */
   public void addWeightedDescriptors(WeightedDescriptor elem);
   public boolean removeWeightedDescriptors(WeightedDescriptor elem);
   public void clearAllWeightedDescriptors();
   public Iterator getAllWeightedDescriptors();
   public List getWeightedDescriptors();
   public void setWeightedDescriptors(List l);

}
