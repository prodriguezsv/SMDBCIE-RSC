package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: QuantitativeHeuristicDescriptor
* @author ontology bean generator
* @version 2009/10/7, 18:01:55
*/
public interface QuantitativeHeuristicDescriptor extends HeuristicDescriptor, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

}
