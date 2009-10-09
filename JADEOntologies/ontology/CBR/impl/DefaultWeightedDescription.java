package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;
import ontology.CBR.*;

/**
* Protege name: WeightedDescription
* @author ontology bean generator
* @version 2009/10/7, 18:01:55
*/
public class DefaultWeightedDescription implements WeightedDescription, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = -192457562360579226L;

  private String _internalInstanceName = null;

  public DefaultWeightedDescription() {
    this._internalInstanceName = "";
  }

  public DefaultWeightedDescription(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: weightedDescriptors
   */
   private List weightedDescriptors = new ArrayList();
   public void addWeightedDescriptors(WeightedDescriptor elem) { 
     weightedDescriptors.add(elem);
     pcs.firePropertyChange("weightedDescriptors", oldList, this.weightedDescriptors);
   }
   public boolean removeWeightedDescriptors(WeightedDescriptor elem) {
     boolean result = weightedDescriptors.remove(elem);
     pcs.firePropertyChange("weightedDescriptors", oldList, this.weightedDescriptors);
     return result;
   }
   public void clearAllWeightedDescriptors() {
     weightedDescriptors.clear();
     pcs.firePropertyChange("weightedDescriptors", oldList, this.weightedDescriptors);
   }
   public Iterator getAllWeightedDescriptors() {return weightedDescriptors.iterator(); }
   public List getWeightedDescriptors() {return weightedDescriptors; }
   public void setWeightedDescriptors(List l) {weightedDescriptors = l; }

}
