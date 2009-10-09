package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: WeightedDescriptor
* @author ontology bean generator
* @version 2009/10/7, 18:01:54
*/
public interface WeightedDescriptor extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: modifier
   */
   public void setModifier(Modifier value);
   public Modifier getModifier();

   /**
   * Protege name: descriptor
   */
   public void setDescriptor(Descriptor value);
   public Descriptor getDescriptor();

}
